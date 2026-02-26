package basics.recursion;

import util.FastScanner;

public class P002_FactorialofNumber {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return fact(n - 1) * n;
    }
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();;
        int result = fact(n);
        System.out.println(result);

    }
}
