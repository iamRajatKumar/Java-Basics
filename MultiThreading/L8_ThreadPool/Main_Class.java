package MultiThreading.L8_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;

    public SomeThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started Thread: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended Thread: "+name);
    }

}

public class Main_Class {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        SomeThread thread01 = new SomeThread("Thread 01");
        SomeThread thread02 = new SomeThread("Thread 02");
        SomeThread thread03 = new SomeThread("Thread 03");
        SomeThread thread04 = new SomeThread("Thread 04");
        SomeThread thread05 = new SomeThread("Thread 05");
        SomeThread thread06 = new SomeThread("Thread 06");
        SomeThread thread07 = new SomeThread("Thread 07");
        SomeThread thread08 = new SomeThread("Thread 08");
        SomeThread thread09 = new SomeThread("Thread 09");
        SomeThread thread10 = new SomeThread("Thread 10");
        SomeThread thread11 = new SomeThread("Thread 11");
        SomeThread thread12 = new SomeThread("Thread 12");
    
        executorService.execute(thread01);
        executorService.execute(thread02);
        executorService.execute(thread03);
        executorService.execute(thread04);
        executorService.execute(thread05);
        executorService.execute(thread06);
        executorService.execute(thread07);
        executorService.execute(thread08);
        executorService.execute(thread09);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        
        executorService.shutdown();
    }

    
}