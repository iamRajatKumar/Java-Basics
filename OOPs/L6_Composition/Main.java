package OOPs.L6_Composition;

import OOPs.L6_Composition.Laptop.Laptop;
import OOPs.L6_Composition.Laptop.Components.GraphicsCard;
import OOPs.L6_Composition.Laptop.Components.Processor;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());
        //here while priniting laptop we will get all the values inside the class
        //while printing laptop.getProcessor() we will get all the values inside processor using getters
        //laptop.getProcessor().getBrand() with this we will get the specific value of Processor brand using getters 
        
        //will use default constructor 
        Processor p1 = new Processor();
        GraphicsCard g1 = new GraphicsCard();
        //will use Parameterized constructor
        Laptop l1 = new Laptop(16.2f, p1, "ddr5", "1TB", g1, "Single Layer", "Normal Keyboard");
        System.out.println(l1);

    }

    //Composition is a fundamental concept in Java programming that enables the creation of complex objects by combining simpler ones along with description
    
}
