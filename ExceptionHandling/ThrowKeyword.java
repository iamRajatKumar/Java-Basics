package ExceptionHandling;

public class ThrowKeyword {
   
    public static void main(String[] args) {
        ThrowKeyword thk = new ThrowKeyword();
        try {
            thk.doSomething();
        } finally{
            System.out.println("hi");
        }
    }

    public void doSomething() throws RuntimeException{
        String x = "one";
        if(x.equals("zero")){
            throw new RuntimeException();
            //manually exception handling
        }
        System.out.println("Do Something!");
    }
}

//throws will handle exception by system