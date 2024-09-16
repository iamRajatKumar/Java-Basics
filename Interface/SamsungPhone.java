package Interface;

public class SamsungPhone implements Phone{
    
    public String processor(){
        return "1000";
    }

    @Override
    public int spaceInGB() {
       return 256;
    }

}
