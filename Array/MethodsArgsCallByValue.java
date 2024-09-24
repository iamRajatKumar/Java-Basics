package Array;

public class MethodsArgsCallByValue {
    public static void main(String[] args) {
        int value = 10;
        MethodsArgsCallByValue methodsArgsCallByValue = new MethodsArgsCallByValue();
        methodsArgsCallByValue.displayValue(value);
    }

    void displayValue(int value){
        System.out.println("Value of variable in method displayValue: "+value);
        value =30;
        System.out.println("Value of variable in method displayValue: "+value);
    }
}
