package twopointers;

public class twoSum2 {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {2, 4, 5, 6, 9};
        int k = 10;
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(k == arr[left] + arr[right]){
                System.out.println((left + 1) + " " + (right + 1));
                break;
            } else if (k < arr[left] + arr[right]) {
                right--;
            }else {
                left++;
            }
        }
    }
}
