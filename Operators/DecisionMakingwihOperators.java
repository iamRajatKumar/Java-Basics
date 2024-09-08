package Operators;
public class DecisionMakingwihOperators {
    public static void main(String[] args) {
        int x = 6;

        if ( x != 6) {
            System.out.println("X is not 6");
        }else {
            System.out.println("X is 6");
        }
        int y = 5;

        if ( y >= 5) {
            System.out.println("y is greater or equal to 5");
        }else {
            System.out.println("y is lower than 5");
        }

        boolean a = true;
        boolean b = false;

        if ( b || a ) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }


    }
}
