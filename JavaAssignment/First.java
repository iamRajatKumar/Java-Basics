package JavaAssignment;

//What Will be the output of following code? why

public class First {
    public static void main(String[] args) {
        Runnable r = () ->{
            int a = 10;
            a++;
            System.out.println(a);
        };
        r.run();
    }
}

// Explanation:

// Runnable is a functional interface with a single method run(),
// The Lambda expression () -> {...} provides implementation of run(),
// inside lambda expression: integer a is initialized to 10, and then a++ happens which is a is incremented by 1 so value of a is 11 now.
// then outside lambda r.run() method get executed printing the value of a = 11. 

