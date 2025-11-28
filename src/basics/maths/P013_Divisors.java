package basics.maths;

import util.FastScanner;

public class P013_Divisors {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();



        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

    }
}
