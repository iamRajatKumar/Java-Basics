package Operators;
public class DecisionMakingOperators {
    public static void main(String[] args) {
        int x =5;
        int y =10;
        if((x<y) && (x>=10)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        int BoyAge=20;
        int GirlAge=28;
        if((BoyAge >= 21) && (GirlAge >= 18)){
            System.out.println("Marrige psooible");
        }else{
            System.out.println("Marriage not possible");
        }
    }
}
