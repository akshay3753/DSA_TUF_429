package basics.maths;

import util.FastScanner;

public class P007_ArmstrongNumber {
    public static void main(String[] args) throws Exception {
        // Write your solution here

        /* Problem Objectives
        1. Take input
        2. Store original number
        3. Count digits in the number
        4. Calculate sum of (digit ^ digits)
        5. Compare computed sum with orignal number
        6. Print Yes if equal, otherwise no
         */

        // Objective 1 . Take input

        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();

        // Objective 2 : Store original number
        int original = n;

        // Objective 3: Count number of digits
        int digits = 0;
        int temp = n;

        while (temp > 0){
            digits++;  // count this digit
            temp /= 10; //
        }

        // objective 4: Calculate sum of digit^digits

        int sum = 0;
        temp = n;

        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Objective 5 and 6 : Compare and print
        if (sum == original) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
