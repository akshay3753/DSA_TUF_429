package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumPrac {
    public static List<List<Integer>> threeSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0 ) break;
            if(i  > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                if(nums[i] > 0){
                    break;
                }
                int sum = nums[i] + (nums[left] + nums[right]);
                if(sum < 0){
                    left++;
                } else if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }else {
                    right--;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {-1,0,1,2,-1,-4}; // -4, -1, -1 , 0, 1, 2
        int target = 0;
        List<List<Integer>> result = threeSum(nums, target);
        System.out.println(result);
    }
}
