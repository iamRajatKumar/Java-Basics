package Array;

public class MethodArgsCallByReference {
    public static void main(String[] args) {
        String[] names = {"rajat", "Sharma", "kumar", "ok"};
        System.out.println(names);
        MethodArgsCallByReference methodArgsCallByReference = new MethodArgsCallByReference();
        methodArgsCallByReference.displayNames(names);
        //calling the memory loaction
        System.out.println(names[0]);
    }

    void displayNames(String[] names){
        System.out.println(names);
        names[0] ="jhon";
    }
}
