package twopointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class squaredNums {
    public static int[] squaredNums(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        int left = 0;
        int right = arr.length -1;
        int pos = arr.length -1;
        while (left <= right){
            if(arr[left] * arr[left] > arr[right] * arr[right]){
                res[pos] = arr[left] * arr[left];
                left++;
            }else {
                res[pos] = arr[right] * arr[right];
                right--;
            }
            pos--;
        }
        return  res;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {-2, 4, -1, 5, 2, 1};
        Arrays.sort(arr);
        squaredNums sol = new squaredNums();
        int result[] = sol.squaredNums(arr);
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }


    }
}
