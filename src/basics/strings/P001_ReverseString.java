package basics.strings;

import util.FastScanner;

public class P001_ReverseString {

    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }


    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fs.next().charAt(0);
        }

        reverseString(arr);

        for(char c : arr) {
            System.out.print(c + " ");

        }

    }
}
