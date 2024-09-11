package OOPs.L6_Composition;

import OOPs.L6_Composition.Laptop.Laptop;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());
        //here while priniting laptop we will get all the values inside the class
        //while printing laptop.getProcessor() we will get all the values inside processor using getters
        //laptop.getProcessor().getBrand() with this we will get the specific value of Processor brand using getters 
    }

    //Composition is a fundamental concept in Java programming that enables the creation of complex objects by combining simpler ones along with description
    
}
