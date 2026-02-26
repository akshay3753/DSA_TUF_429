package basics.arrays;

import util.FastScanner;

public class P002_OddNumbers {

    public static int countOdd(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
        System.out.println(countOdd(arr));
    }
}
