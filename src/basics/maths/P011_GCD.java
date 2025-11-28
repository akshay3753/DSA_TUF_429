package basics.maths;

import util.FastScanner;

public class P011_GCD {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner(System.in);
        int a = fs.nextInt();
        int b = fs.nextInt();

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
