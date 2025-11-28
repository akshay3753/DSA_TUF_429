package basics.maths;

import util.FastScanner;

public class P008_PerfectNumber {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        /* Problem Objectives
        Calculate sum of proper divisors of n
        Compare computed sum with n
        Preint yes if equal, otherwise no
         */

        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();

        if(n <= 1){
            System.out.println("No");
            return;
        }

        // Objective 3 : Calculate sum of proper divisors
        int sum = 1;
        int limit = (int) Math.sqrt(n);

        for (int d = 2; d <= limit; d++){
            if (n % d == 0){         // d is a divisor
                int pair = n / d;

                if (d == pair){
                    sum += d;
                } else {
                    sum += d + pair;
                }
            }
        }

        if (sum == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
