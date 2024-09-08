package JavaMethods;

public class Area {
    public static void main(String[] args) {
        int rect = areaOfRectangle(10,15);
        System.out.println("Area of rectangle: "+rect);
        double cir = areaOfCircle(8);
        System.out.println("Area of circle : "+cir);
    }

    private static double areaOfCircle(int r) {
       return 3.14*r*r;
    }

    public static int areaOfRectangle(int height, int width){
        return height*width;
    }
}
