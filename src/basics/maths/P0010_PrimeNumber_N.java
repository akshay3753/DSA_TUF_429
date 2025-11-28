package basics.maths;

import util.FastScanner;

public class P0010_PrimeNumber_N {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt();

        int count = 0;

        for(int num = 2; num <= n; num++){
            boolean isPrime = true;

            int limit = (int) Math.sqrt(num);

            for (int d = 2; d <= limit; d++){
                if(num % d == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}
