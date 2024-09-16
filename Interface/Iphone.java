package Interface;

public class Iphone implements Phone {

    public String processor(){
        return "A15";
    }

    //@override means we are overriding from base class or implements as interface
    @Override
    public int spaceInGB() {
        return 128;
    }
    
}