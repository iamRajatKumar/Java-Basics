package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        int y=0,x,z;
        try {
            System.out.println("Before exception");
            z= (10*10)/0; 
            x = (y = 10*10)/0;
            //y will get updated even x gave exception
            System.out.println(x+""+z);
            System.out.println("after exception "); 
        } catch (ArithmeticException e) {
            System.out.println("Airthmetic Exception");
            System.out.println(e);
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Divided by 0 exception");
            System.out.println(e);
            e.printStackTrace();
        }finally{
        System.out.println("Value of y : "+y);
        }
        //sequence of catch block matters we can put child class after parent class
        //finally block will always execute
        //finally have to run at the end of the try catch
        //we can use finally with try
    }
}
