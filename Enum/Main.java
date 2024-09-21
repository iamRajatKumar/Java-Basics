package Enum;

public class Main {
    // public static final int COREJAVA = 1; //comstant variables
    // public static final int COLLECTIONS = 2;
    // public static final int GENERICS = 3;
    // public static final int JSP = 4;
    // public static final int MULTITHREADING = 5;

    public static void main(String[] args) {
        Learning learning = Learning.GENERICS;
        switch (learning) {
            case COREJAVA -> System.out.println("Core Java");
            case COLLECTIONS -> System.out.println("Collections");
            case GENERICS -> System.out.println("Generics");
            case JSP -> System.out.println("Jsp");
            case MULTITHREADING -> System.out.println("Multithreading");

        }
        System.out.println(Learning.COREJAVA);
    }
}
