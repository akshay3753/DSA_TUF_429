package ArrayMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicatesArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 2, 5};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                if(!result.contains(nums[i])){
                    result.add(nums[i]);
                }
            }
        }

        System.out.println(result);
    }
}