package basics.arrays;

import util.FastScanner;

public class P003_SortedElements {
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
        System.out.println(isSorted(arr));

    }
}
