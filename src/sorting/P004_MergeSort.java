package sorting;

public class P004_MergeSort {
    public static int[] split(int[] arr, int[] low, int[] high){
        if(low >= high){
            return ;
        }

    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {3, 6, 7, 1, 2, 9};
        int n =  arr.length;
        System.out.println(split(arr, 0 , 5));
    }
}
