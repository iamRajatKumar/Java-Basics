package OOPs.L8_Polymorphism;

import OOPs.L8_Polymorphism.phone.Iphone;
import OOPs.L8_Polymorphism.phone.Nokia3310;
import OOPs.L8_Polymorphism.phone.Phone;

public class Main {
    public static void main(String[] args) {
        // Phone phone = new Phone();
        // phone.feature();

        // Nokia3310 nokia = new Nokia3310();
        // nokia.feature();

        // Iphone iphone = new Iphone();
        // iphone.feature();


        //Reference of polymorphism
        //based on the base class it will get the object type
        Phone phone;
        phone = new Iphone();
        phone.feature();

    }
}
