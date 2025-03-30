package MultiThreading.L9_CountDownLatch;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread{
    private CountDownLatch latch;
    
    public SomeThread(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
       System.out.println("Started Thread: "+Thread.currentThread().getName());
       System.out.println("Ended Thread : "+Thread.currentThread().getName());
       System.out.println("--------------------------------------------");
       latch.countDown();
    }

    
}

public class CountDownLatchClass {
    public static void main(String[] args)throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(4);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);
        thread1.start();
        thread2.start();
        thread3.start();;
        thread4.start();
        
        latch.await();
        System.out.println("Main Thread : "+Thread.currentThread().getName());
    }
}
