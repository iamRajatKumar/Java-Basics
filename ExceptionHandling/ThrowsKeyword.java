package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {

    public static void main(String[] args) {
        ThrowsKeyword tk = new ThrowsKeyword();
        try {
            tk.doSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() throws FileNotFoundException{
        FileReader in = new FileReader(" My files");
        System.out.println(in);
        System.out.println("Do something!");
    }

}

