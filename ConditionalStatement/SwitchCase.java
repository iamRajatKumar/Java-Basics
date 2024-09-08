package ConditionalStatement;

public class SwitchCase {
    public static void main(String[] args) {
        String name = "Editor";
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Rajat");
                break;
            case "team":
                System.out.println("Wipro");
                break;
            case "editor":
                System.out.println("Nothing");
                break;
            default:
                System.out.println("Invalid");
        }
    }

}
