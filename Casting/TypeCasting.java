package Casting;
public class TypeCasting {
    public static void main(String[] args) {
        short a1= 200;
        byte a2 =(byte)a1; //converting short to byte
        System.out.println(a2);

        float f = 10.5f;
        int i = (int)f; //cpnverting float to int
        System.out.println(i);

        int a =25;
        float b = 42.159f;
        int value = (int)(a*a + 2*a*b + b*b);
        System.out.println(value);
    }
}
