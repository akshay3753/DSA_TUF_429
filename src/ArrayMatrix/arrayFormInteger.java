package ArrayMatrix;

public class arrayFormInteger {
    public static void main(String[] args) {
        // Write your solution here
//        int[] arr = {1, 2, 0 , 0};
//        int k = 34;
//
//        int sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//           sum = sum * 10 + arr[i];
//        }
//        int total_sum = sum + k;
//        System.out.println(total_sum);

       int n = 1234;
       int last_digit = 0;
       int sum = 0;
       int count = 0;
       while(n > 0){
           last_digit = n % 10;
           System.out.println(last_digit);
           sum = sum * 10 + last_digit;
           n = n / 10;
           count++;
       }
        System.out.println("Count: "  + count);
        System.out.println(sum);
        int[] arr = new int[count];
        int[] result = new int[count];
        int idx = count - 1;  // start from back!
        while(sum > 0){
            result[idx] = sum % 10;
            sum = sum / 10;
            idx--;
        }
        System.out.println(result);
    }
}
