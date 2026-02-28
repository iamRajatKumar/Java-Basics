package DSA.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        int [] result = topKFrequent(nums, k);
        for(int num: result){
            System.out.print(num+" ");
        }
        
    }

    public static int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> frequencyMap = new HashMap<>();
       for(int num : nums){
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) +1);
       }

       PriorityQueue<Integer> minHeap = new PriorityQueue<>( (a,b)->
        frequencyMap.get(a) - frequencyMap.get(b));

        for(int key: frequencyMap.keySet()){
            minHeap.offer(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }        
        }
        

        int [] result =  new int[k];
        int index = 0;
        while(!minHeap.isEmpty()){
            result[index++] = minHeap.poll();
        
        }
       
       return result;
    }
}

//output: 1 2 or 2 1 (order may vary)