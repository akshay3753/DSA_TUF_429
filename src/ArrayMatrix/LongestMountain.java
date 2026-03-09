package ArrayMatrix;

public class LongestMountain {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {4, 5, 1, 2, 7, 3, 2, 6, 1};
        int maxLength = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr [i + 1]){
                int start = i;
                while(start > 0 && arr[start] > arr[start-1]){
                    start--;
                }
                int end = i;
                while(end < arr.length - 1 && arr[end] > arr[end + 1 ]){
                    end++;
                }
                int length = end - start + 1;
                maxLength = Math.max(maxLength, length);
            }
        }
        System.out.println(maxLength);
    }
}
