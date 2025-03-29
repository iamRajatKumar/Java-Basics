package Loops;

public class SumOfDigits {

    public static void main(String[] args) {
        int x=1;
        int sumofDigits = 0;
        while(true){
            sumofDigits = sumofDigits +(x%10);
            x=x/10;
            if(x<1) break;
        }
        System.out.println("Sum of digit: "+sumofDigits);
    }
    
    
}
