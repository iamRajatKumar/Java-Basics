package ConditionalStatement;

public class SwitchUsingLambdaExpression {
    public static void main(String[] args) {
        String name="Rajat";
        //-> symbol is used for lamba expression and doesnot require break here
        switch (name.toLowerCase()) {
            case "Sonal" -> System.out.println("Hi");
            
            case "rajat" -> System.out.println("Hello");
                
            case "prajjwal" ->  System.out.println("bye");
                
            default -> System.out.println("Invalid");
               
        }
    }
}
