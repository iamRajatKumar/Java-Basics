package FinalKeyword;

public class Main {
   public static void main(String[] args) {
    
    Child child = new Child();
    System.out.println(child.x);
    // child.setX(100);
    Child childx = new Child(102);
    System.out.println(childx.x);

    Child2 child2 = new Child2();
    child2.India();
    child2.Usa();
   } 
}
