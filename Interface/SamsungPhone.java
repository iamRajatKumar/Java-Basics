package Interface;

public class SamsungPhone implements Phone,Android{
    
    public String processor(){
        return "1000";
    }

    @Override
    public String spaceInGB() {
       return " GB";
    }

    @Override
    public String whatsapp() {
        return "Hi! there";
    }

}
