package DSA.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap =  new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);

            if(freqMap.get(num)> n/2) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        MajorityElement me = new MajorityElement();
        int result = me.majorityElement(nums);
        System.out.println(result);
    }
}

