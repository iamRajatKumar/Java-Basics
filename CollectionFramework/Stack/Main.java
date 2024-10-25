package CollectionFramework.Stack;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(25);
        nums.push(20);
        nums.push(23);
        nums.push(28);
        nums.push(29);
        nums.push(21);
        System.out.println(nums);
        //search an element
        System.out.println(nums.search(28));
        //pop an element 
        System.out.println("Pop last element"+nums.pop());
        //o/p after poping
        System.out.println(nums);
    }
    
}