package twopointers;

import java.util.Arrays;

public class threeSumCloset {
    public static int threeSum(int[] nums, int target){
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                    closestSum = currentSum;
                }
                if(currentSum < target){
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {-1, 2, 1, -4}; // -4 -1 1 2
        int target = 1;
        int result = threeSum(nums, target);
        System.out.println(result);
    }
}
