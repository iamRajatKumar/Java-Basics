package ExceptionHandling;

public class UserDefinedException {
    public static void main(String[] args) {
        UserDefinedException ude = new UserDefinedException();
        try {
            ude.doSomething();
        } catch (ZeroException e) {
            e.printStackTrace();
        }
    }

    // user defined exception
    class ZeroException extends Exception {

    }

    public void doSomething() throws ZeroException {
        String x = "zero";
        if (x.equals("zero")) {
            throw new ZeroException();
        }
        System.out.println("Do Something!");

    }
}
