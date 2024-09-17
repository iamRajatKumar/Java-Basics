package OOPs.L9_Abstraction;

import OOPs.L9_Abstraction.person.Deepali;
import OOPs.L9_Abstraction.person.Person;

public class Main {
    
    public static void main(String[] args) {
        Person person = new Deepali();
        person.eat();
        person.speak();

        //Anonumus object
        Person p2 = new Person() {
            @Override
            public void eat(){
                System.out.println("Eat Food!");
            }
        };
        p2.speak();
        p2.eat();
    }
}
