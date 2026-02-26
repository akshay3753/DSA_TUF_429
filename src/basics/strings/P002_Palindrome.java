package basics.strings;

public class P002_Palindrome {

    // Function that checks palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hannah";

        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
