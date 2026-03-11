package ArrayMatrix;

public class rotateArray {
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray obj = new rotateArray();

        // step 1 - reverse whole array
        obj.reverse(arr, 0, arr.length - 1);

        // step 2 - reverse first k elements
        obj.reverse(arr, 0, k - 1);

        // step 3 - reverse rest
        obj.reverse(arr, k, arr.length - 1);

        // print
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}