package basics.maths;

public class P001_CountDigits {

    public static void main(String[] args) {
        System.out.println(countDigits(12345));  // 5
        System.out.println(countDigits(10000));  // 5
        System.out.println(countDigits(7));      // 1
        System.out.println(countDigits(0));      // 1
        System.out.println(countDigits(-9876));  // 4
    }

    public static int countDigits(int n) {
        n = Math.abs(n);

        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
