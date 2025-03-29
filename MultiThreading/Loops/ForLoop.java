package MultiThreading.Loops;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=10;i>1; i=i-2){
            System.out.println(i);
        }
        System.out.println("----------------------");
        
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("-----------------------");
        int i=5;
        for(i=0; i<=10; ++i){ //here the value of i will reassign to 0
            System.out.println(i);
        }
        System.out.println("------------");
    }
}
