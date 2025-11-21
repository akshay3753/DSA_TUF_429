package basics.maths;

public class P003_ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));   // 321
        System.out.println(reverseNumber(450));   // 54
        System.out.println(reverseNumber(-321));  // -123
    }

    public static int reverseNumber(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return sign * rev;
    }
}
