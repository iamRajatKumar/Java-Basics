package MultiThreading.L10_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                queue.put(BlockingQueue.counter);
                System.out.println("Value added in the queue : "+BlockingQueue.counter);
                BlockingQueue.counter++;
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}

public class BlockingQueue {
    public static int counter = 1;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(queue));
        thread1.start();
    }
}
