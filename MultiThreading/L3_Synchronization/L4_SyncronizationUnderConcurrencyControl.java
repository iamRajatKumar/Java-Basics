package MultiThreading.L3_Synchronization;

public class L4_SyncronizationUnderConcurrencyControl {
    public static int counter = 0;
    public static void main(String[] args)throws InterruptedException {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0; i<= 100000; i++){
                    L4_SyncronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("loop in thread 1 is over");
            }
            
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0; i<= 100000; i++){
                    L4_SyncronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("loop in thread 2 is over");
            }
            
        }).start();
        Thread.sleep(300);
        System.out.println(counter);
    }
    
}
