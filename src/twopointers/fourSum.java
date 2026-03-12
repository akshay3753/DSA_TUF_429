package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public List<List<Integer>> fourSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i+1; j < nums.length -2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + (nums[left] + nums[right]);
                    if(sum == 0){
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                } else if (sum < 0) {
                        left++;
                    }else {
                        right--;
                    }
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        // Write your solution here

            int[] nums = {1,0,-1,0,-2,2};  //{-2, -1, 0,0, 1, 2}
            fourSum obj = new fourSum();
            List<List<Integer>> result=obj.fourSum(nums);
            System.out.println(result);
        }
    }

