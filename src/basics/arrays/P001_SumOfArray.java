package basics.arrays;

import util.FastScanner;

public class P001_SumOfArray {

    // 1) Define the function OUTSIDE main
    public static int sumOfArray(int[] arr) {

        int sum = 0;  // initialize sum

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   // accumulate
        }

        return sum;  // return final sum
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
        System.out.println(sumOfArray(arr));
    }
}
