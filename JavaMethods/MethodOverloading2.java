package JavaMethods;

public class MethodOverloading2 {
    public static void main(String[] args) {
        sum(1,2);
        sum(2.1f,2.2f);
        sum(1.2, 20);
        sum(1,2.0);
    }

    private static void sum(int i, int j) {
        int x = i+j;
        System.out.println("Addition of int: "+x);
    }
    private static void sum(float f, float g) {
        float x = f+g;
        System.out.println("Addition of float : "+x);    
    }

    private static void sum(double d, int j) {
        double x = d+j;
        System.out.println("Addition of double and int: " +x);
    }

    private static void sum(int i, double d) {
        int x = (int)(i+d);
       System.out.println("Addition of int and double :" +x);
    }
    
    
}
