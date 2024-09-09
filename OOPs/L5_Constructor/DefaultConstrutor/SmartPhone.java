package OOPs.L5_Constructor.DefaultConstrutor;

public class SmartPhone {

    private String brand;
    
    //Default constructor
    public SmartPhone(){
         //In default constructor we dont pass any paramenter in argument and will receive null value or 0 in output
        //System.out.println("Samsung");
    }

    //Parameterized constructor
    public SmartPhone(String brand) {
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }
}
