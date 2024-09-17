package OOPs.L10_Interface;

//To restrict the value we use interface in java
//for being specific we use interface

public class Main {
    public static void main(String[] args) {
        //Accessing interface in simple
        SamsungPhone samsungPhone = new SamsungPhone();
        String p =samsungPhone.processor();
        String gb = samsungPhone.spaceInGB();
        String mgs = samsungPhone.whatsapp();
        System.out.println(p +", "+gb+", "+mgs);
        

        Iphone iphone = new Iphone();
        String s = iphone.processor();
        String GB = iphone.spaceInGB();
        String air = iphone.airDrop();
        System.out.println(s+". "+GB+", "+air);

        //Accessing interface using polymorphism
        // Phone p = new SamsungPhone();
        // String s = p.processor();
        // System.out.println(s);
        // System.out.println(p.spaceInGB());
        
    }
}
