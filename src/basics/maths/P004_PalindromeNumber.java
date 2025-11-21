package basics.maths;

public class P004_PalindromeNumber {

    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(123));   // false
        System.out.println(isPalindrome(-121));  // false
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return rev == original;
    }
}
