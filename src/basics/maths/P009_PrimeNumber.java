package basics.maths;

import util.FastScanner;

public class P009_PrimeNumber {
    public static void main(String[] args) throws Exception {
        // Write your solution here

        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();

        if (n <= 1){
            System.out.println("No");
            return;
        }

        int limit = (int) Math.sqrt(n);

        // Check divisibility

        boolean isPrime = true;

        for (int d = 2; d <= limit; d++){
            if (n % d == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
