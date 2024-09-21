package String;

public class Main {

    public static void main(String[] args) {
        String x = "Rajat";
        //String is implemented as a class
        String y = "Sharma";
        String z = x+" "+y;
        System.out.println(z);
        System.out.println("---------");
        if(z.equals("Rajat Sharma")){
            System.out.println("hi "+z);
        }else if(z == "Rajat Sharma"){
            System.out.println("break");
        }else{
            System.out.println("nothing");
        }

        String m =z.replaceAll(x, y);
        System.out.println(m);

        String Country = "USA";
        String Country2 = "India";
        String bestCountry = Country.replaceAll(Country, Country2);
        System.out.println(bestCountry);
    } 
    
}