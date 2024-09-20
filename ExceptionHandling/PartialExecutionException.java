package ExceptionHandling;

public class PartialExecutionException {
    public static void main(String[] args) {
        try{
            System.out.println("Before exception");
            System.out.println("The divide by 0 exception : "+10/0);
            System.out.println("after exception ");
        }catch(Exception e){
            System.out.println("Divided by 0 exception");
            System.out.println(e);
            e.printStackTrace();
        }
    }
    //output Partial Excecution of code
    // Before exception
    // Divided by 0 exception
    // java.lang.ArithmeticException: / by zero
    // java.lang.ArithmeticException: / by zero
    // at ExceptionHandling.AirthmeticException.main(AirthmeticException.java:7)

}
