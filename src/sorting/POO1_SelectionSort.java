package sorting;

import java.util.Arrays;

public class POO1_SelectionSort {
    public static int[] SelectionSort(int[] arr){


        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

        // Write your solution here
        public static void main(String[] args) {
            int arr[] = {3, 4, 5, 1, 2};
            System.out.println(Arrays.toString(SelectionSort(arr)));
        }

}
