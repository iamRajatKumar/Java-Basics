package MultiThreading.L3_Synchronization;

class Brackets{
    //synchronized is used in threads to generate synchronized result
    synchronized public void generate(){
        for(int i=0; i<=20;i++){
            if(i<=10){
                System.out.print('[');
            }else{
                System.out.print(']');
            }
        }
        System.out.println();
    }
}

public class L5_SynchorizedMethods {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    brackets.generate();
                }
            }
            
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    brackets.generate();
                }
            }
            
        }).start();
    }
}
