package twopointers;

import java.util.Arrays;

public class boatsSave {
    public static int boatsSave(int[] nums, int limit) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int boats = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {3, 3, 1, 4, 5};
        int limit = 5;
        int result = boatsSave(nums, limit);
        System.out.println(result);
    }
}
