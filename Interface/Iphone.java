package Interface;

public class Iphone implements Phone,IOS {

    public String processor(){
        return "A15";
    }

    //@override means we are overriding from base class or implements as interface
    @Override
    public String spaceInGB() {
        return "128 GB";
    }

    @Override
    public String airDrop() {
        return "Working fine";
    }
    
}