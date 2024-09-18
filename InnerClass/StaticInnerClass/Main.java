package InnerClass.StaticInnerClass;

public class Main {
    public static void main(String[] args) {
        
        //Outer outer = new Outer();
        //outer.message();
        
        Outer.Inner.StaticMessage();

        // we want use static class if we have to make the element static
    }
}
