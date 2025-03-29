package Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //for loop
        for(int i=0; i>5; i++){
            System.out.println("Cond. true "+i);
        }
        System.out.println("Cond. fasle exiting loop ");
        System.out.println("-----------");
        //While loop
        int i =0;
        while(i>2){
            System.out.println("Cond. true "+i);
            i++;
        }
        System.out.println("Cond. fasle exiting loop ");
        System.out.println("-----------");
        //do while we execute once even if the condition is false
        int j = 5;
        do{
            System.out.println(j);
            j++;
        }while(j>10);
        System.out.println("do while we execute once even if the condition is false");
    }
}
