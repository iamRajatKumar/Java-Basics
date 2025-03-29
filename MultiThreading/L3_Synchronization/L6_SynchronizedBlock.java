package MultiThreading.L3_Synchronization;

class Brackets{
    
    public void generate()throws InterruptedException{
        //synchronized block is used to synchronized some parts of the method
        //synchronized block using current object this
        synchronized(this){
            for(int i=0; i<=20;i++){
                Thread.sleep(5);
                if(i<=10){
                    System.out.print('[');
                }else{
                    System.out.print(']');
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(10);
        }
    }
}

public class L6_SynchronizedBlock {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i=0; i<5; i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Totall time for processing thread 1 : "+(endTime-startTime));
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i=0; i<5; i++){
                    try {
                        brackets.generate();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Totall time for processing thread 2 : "+(endTime-startTime));
            
            }
            
        }).start();
    }
}
