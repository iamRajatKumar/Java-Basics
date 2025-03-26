package MultiThreading.L2_RunnableInterface;

import static java.lang.Thread.sleep;

import java.util.Random;

class MyCounter implements Runnable{
    
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for(int i = 0; i <10; i++){
            try {
                Random random = new Random();
                sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thre no: "+threadNo +" and iteration no: "+i);
        }    
    }
    
}

public class RunnableInterface {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();
    }
}
