package MultiThreading.L6_Interrupt;

public class InterruptJavaMultithreading {
    
     public static int balance = 0;
    synchronized public void withdraw(int amount){
        if(balance <= 0){
            System.out.println("Waiting for amount to be updated after withdrawal of $"+amount);
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Withdrawal Interrupted");
                return;
            }
        }
        if(balance - amount < 0){
            System.out.println("Balance is too Low for Withdrawal $"+balance);
            System.out.println("Withdrawal Incomplete");
            return;
        }
        balance = balance - amount;
        System.out.println("The current balance is : $" +balance);
    }
    public boolean desposit(int amount){
        synchronized(this){
            if(amount > 0){
                System.out.println("We are depositing the amount in the bank of sum $"+amount);
                balance = balance +amount;
                notify();
                return true;
            }else{
                System.out.println("Invalid Amount");
                return false;
            }
        }
    }
    public static void main(String[] args) {
        InterruptJavaMultithreading InterruptJavaMultithreading = new InterruptJavaMultithreading();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                InterruptJavaMultithreading.withdraw(3000);
            }
            
        });
        thread1.setName("Thread 1");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(InterruptJavaMultithreading.desposit(0)){
                    System.out.println("Transaction completed!");
                }else{
                    thread1.interrupt();
                }
            }
            
        });
        thread2.setName("Thread 2");
        thread2.start();
    }

}
