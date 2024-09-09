//Child class
package OOPs.L5_Inheritance.vehicles;

public class Bike extends Vehicle {

    public String handle; 

    //default constructor
    public Bike() {
        handle = "short";
    }

    //parameterized constructor
    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        //super will pass these values to Vehicle class
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    //tostring method helps us to directly print the object
    @Override
    public String toString() {
        return "Bike [handle=" + handle + "]" + super.toString(); // String concat with toString method, it will call all methods of parent class
    }

    //when ever there is a method with smae name in parent class and in child class the child class always wins/executed
    // public String run(){
    //     return "not running";
    // }
    
    

}
