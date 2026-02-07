package array;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int nums[] = {10,20,20,30,30,30};
    System.out.println(removeDuplicates(nums));
  }
  
  public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int res = 1;
        for(int i=0; i<n; i++){
            if(nums[i] != nums[res-1]){
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }  

}