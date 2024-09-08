package OOPs.L4_AddingFunctionalityToJavaClass;

public class Car {
    private String doors;
    
    private String engine;
    
    private String driver;
    
    private int speed;

    //doors
    public String getDoors() {
        return doors;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    
    //engine
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

    //driver
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    //speed
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on") &&
        driver.equals("seated") && speed>0){
            return "running";
        }else{
            return "not running";
        }

    }
    
}
