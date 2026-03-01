package arrays.logicbuilding;

public class missingNumberOptimal {
    public static int findMissing(int[] nums){
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        return  expectedSum - actualSum;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] nums = {0, 1, 2, 3, 4};
        System.out.println(findMissing(nums));
        // Test 1
        int[] test1 = {0, 2, 3, 1, 4};
        System.out.println(findMissing(test1)); // Expected: 5

// Test 2
        int[] test2 = {0, 1, 2, 4, 5, 6};
        System.out.println(findMissing(test2)); // Expected: 3

// Test 3
        int[] test3 = {1, 3, 6, 4, 2, 5};
        System.out.println(findMissing(test3)); // Expected: 0

// Test 4 (Edge case)
        int[] test4 = {0};
        System.out.println(findMissing(test4)); // Expected: 1
    }
}
