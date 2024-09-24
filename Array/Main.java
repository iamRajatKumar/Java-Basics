package Array;

public class Main {
    public static void main(String[] args) {
        //manually assigning value
        String[] x = {"Rajat","Sharma"};
        System.out.println(" ");
        System.out.println(x[0]);
        //when we access the array value which does not exist
        //we get Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        //this ArrayIndexOutOfBoundsException is a type of unchecked exception

        //making array to a particular size
        String[] x2;
        x2 = new String[10]; //fixed size of array 0-9
        x2[0] = "Hi";
        x2[1]= "hello";
        System.out.println(x2[0]);
        System.out.println("---------------------------------");

        int[] num;
        num = new int[5];
        num[1] = 3;
        num[4]= 4;
        num[0] = 1;
        System.out.println(num[0]+""+num[4]+""+num[1]);

        System.out.println("---------------------------------");
        String[] myNames ={"Rajat", "Deepali", "Sharma", "Kumar"};
        //foreach will take all the names from myNames array and put it in "name" staring from index 0 
        for (String name : myNames) {
            System.out.println(name);
        }
    }
}
