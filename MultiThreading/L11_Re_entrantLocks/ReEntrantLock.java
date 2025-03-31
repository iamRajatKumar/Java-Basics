package MultiThreading.L11_Re_entrantLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLock {
    public static int counter = 0;
    static Lock lock = new ReentrantLock();
    
    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                lock.lock();
                try {
                    for(int i=0; i<100000; i++){
                        ReEntrantLock.counter++;
                    }
                }finally{
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                lock.lock();
                try {
                    for(int i=0; i<100000; i++){
                        ReEntrantLock.counter++;
                    }
                }finally{
                    lock.unlock();
                }
            }
            
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter : "+ReEntrantLock.counter);
    }
}
