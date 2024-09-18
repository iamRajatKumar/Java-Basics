package UserInput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your Name :");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Your age :");
        int age = s.nextInt();
        System.out.println("Hello "+name+" Age is: "+age);
        s.close();
    }
}
