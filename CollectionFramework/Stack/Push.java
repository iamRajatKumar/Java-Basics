package CollectionFramework.Stack;
import java.util.Stack;

public class Push {

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(25);
        nums.push(20);
        nums.push(23);
        nums.push(28);
        nums.push(29);
        nums.push(21);
        System.out.println(nums);
    
        System.out.println(nums.search(28));
    
        
    }
    
}