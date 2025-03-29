package MultiThreading.L4_VolatileKeyword;

public class Volatile {
    //to remove cache from thread we use volatile keyword.
    volatile public static int flag = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 0;
                while(true){
                    if(flag == 0){
                        System.out.println(i+" : Running...");
                    }
                }
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = 1;
                System.out.println("The Value of Flag updated, and thread 1 stopped");
            }
        
        }).start();
    }
}
