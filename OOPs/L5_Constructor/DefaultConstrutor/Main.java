package OOPs.L5_Constructor.DefaultConstrutor;

public class Main {

    public static void main(String[] args) {
        SmartPhone phone =new SmartPhone("Samsung");
        SmartPhone iphone =new SmartPhone();
        System.out.println(phone.getBrand()+" "+iphone.getBrand());
    }
}
