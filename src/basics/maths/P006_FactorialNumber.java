package basics.maths;

import util.FastScanner;

public class P006_FactorialNumber {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs  = new FastScanner(System.in);
        int n = fs.nextInt();

        long result = 1; // factorial always start from 1

        // multiply all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println(result);
    }
}
