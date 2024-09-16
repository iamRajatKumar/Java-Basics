package Interface;

//To restrict the value we use interface in java
//for being specific we use interface

public class Main {
    public static void main(String[] args) {
        //Accessing interface in simple
        // SamsungPhone samsungPhone = new SamsungPhone();
        // String p =samsungPhone.processor();
        // System.out.println(p);
        // System.out.println(samsungPhone.spaceInGB());

        // Iphone iphone = new Iphone();
        // String s = iphone.processor();
        // System.out.println(s);
        // System.out.println(iphone.spaceInGB());

        //Accessing interface using polymorphism
        Phone p = new SamsungPhone();
        String s = p.processor();
        System.out.println(s);
        System.out.println(p.spaceInGB());
    }
}
