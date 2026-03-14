package twopointers;

import java.util.Arrays;

public class threeSumSmallest {
    public static int threeSmall(int[] nums, int target){
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int tripletSum = nums[i] + nums[left] + nums[right];
                if (tripletSum < target) {
                    count += (right - left); // Capture all valid triplets for this left pointer
                    left++; // Move left to increase the sum
                } else {
                    right--; // Move right to decrease the sum
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {-10, -8, -3, 1, 5};
        int target = -5;
        int result = threeSmall(nums, target);
        System.out.println(result);
    }
}
