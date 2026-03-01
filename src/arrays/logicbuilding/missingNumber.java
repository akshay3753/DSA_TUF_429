package arrays.logicbuilding;

public class missingNumber {
    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {0, 1, 3, 2, 5, 6};
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < smallest){
                smallest = nums[i];
            } else if (nums[i] > greatest) {
                greatest = nums[i];
            }
        }

        for (int i = smallest; i <= greatest ; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if(i == nums[j]){
                     found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
                break;
            }
        }
    }
}
