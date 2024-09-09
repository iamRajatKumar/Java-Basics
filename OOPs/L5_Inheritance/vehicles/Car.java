package OOPs.L5_Inheritance.vehicles;

public class Car extends Vehicle{

  public String steering;
  public String engine;
  // public String musicSystem;
  // public String airConditioner;
  // public String fridge;
  // public String entertainmentSystem; 

  public Car(String engine, int wheels, int seats, int fuelTank, String lights, String steering) {
    super(engine, wheels, seats, fuelTank, lights);
    this.steering = steering;
  }

  public Car() {
    steering = "Power steering";
    engine = "ON";
  }

  public String getSteering() {
    return steering;
  }

  @Override
  public String toString() {
    return "Car [steering=" + steering + "]" + super.toString();
  }
  
    public String run(){
      return "running";
    }
    
}
