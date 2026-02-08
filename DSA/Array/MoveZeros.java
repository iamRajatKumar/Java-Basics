package DSA.array;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {8, 5, 0, 10, 0, 20};

        moveZeroes(nums); // just call the method
        System.out.println(Arrays.toString(nums)); // print array
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, count);
                count++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


