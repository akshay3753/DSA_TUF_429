package basics.arrays;

import util.FastScanner;

public class P004_ReverseArray {

    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
    public static void main(String[] args)throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }
        reverseArray(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
