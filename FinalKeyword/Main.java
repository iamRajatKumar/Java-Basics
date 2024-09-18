package FinalKeyword;

public class Main {
   public static void main(String[] args) {
    
    Child child = new Child();
    System.out.println(child.x);
    // child.setX(100);
    Child child2 = new Child(102);
    System.out.println(child2.x);

   } 
}
