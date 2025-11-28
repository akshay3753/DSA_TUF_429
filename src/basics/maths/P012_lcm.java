package basics.maths;

import util.FastScanner;

public class P012_lcm {
    public static void main(String[] args)throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner(System.in);
        int n1 = fs.nextInt();
        int n2 = fs.nextInt();

        int x = n1;
        int y = n2;

        while(n2 != 0){
            int temp = n2;
             n2 = n1 % n2;
             n1 = temp;
        }

        int gcd = n1;

        int lcm = (int) x * (int) y / gcd;
        System.out.println(lcm);
    }
}
