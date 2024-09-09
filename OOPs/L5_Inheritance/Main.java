package OOPs.L5_Inheritance;


import OOPs.L5_Inheritance.vehicles.Bike;
import OOPs.L5_Inheritance.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol",2,2,21,"LED","short" );
        // bike.handle ="Short";
        // bike.engine ="Petrol";
        // System.out.println(bike.engine);
        System.out.println(bike.run());

        Car car = new Car("petrol", 4, 7, 21, "LED", "power steering");
        System.out.println(car.run());
    }
}
