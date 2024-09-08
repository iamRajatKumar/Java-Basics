package OOPs.L4_AddingFunctionalityToJavaClass;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        //running class methods with values
        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("off");
        car.setSpeed(10);
        System.out.println(car.run());
    }
}