package InnerClass.StaticInnerClass;

public class Outer {
    
    // public static void message(){
    //     System.out.println("Hello there static!");
    // }
   

    public static class Inner {
    
        public static void StaticMessage(){
            System.out.println("Hello there static!");
        }
    }

    public class nonStaticInnerClass {
        public void nonStaticMessage(){
            System.out.println("Hello Non Static");
        }
        
    }
}
