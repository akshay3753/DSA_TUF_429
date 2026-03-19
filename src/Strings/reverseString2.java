package Strings;

public class reverseString2 {
    public static String reverseStr(String s, int k){
              char[] a = s.toCharArray();

              for(int start = 0; start < a.length - 1; start += 2 * k){
                  int left = start;
                  int right = Math.min(start + k - 1, a.length -1 );
                  while(left < right){
                      char temp = a[left];
                      a[left] = a[right];
                      a[right] = temp;
                      left++;
                      right--;
                  }
              }
              return new String(a);
    }

    public static void main(String[] args) {
        // Write your solution here
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
