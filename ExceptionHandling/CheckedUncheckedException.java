package ExceptionHandling;

public class CheckedUncheckedException {
    public static void main(String[] args) {
        CheckedUncheckedException cue = new CheckedUncheckedException();
        cue.doSomething();
    }

    

    public void doSomething() {
        String x = "zero";
        if (x.equals("zero")) {
            throw new RuntimeException();
            //Runtime Error are unchecked exception
            //FileNotFoundException checeked exception (serious Exceptions)
        }
        System.out.println("Do Something!");

    }
}
