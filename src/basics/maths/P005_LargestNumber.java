package basics.maths;
import util.FastScanner;
public class P005_LargestNumber {
    public static void main(String[] args) throws Exception {
        // Write your solution here
        FastScanner fs  = new FastScanner(System.in);
        int n = fs.nextInt();

       int maxDigit = 0;
       int last_digit = 0;
       
       while(n > 0){
            last_digit = n % 10;
           if (last_digit >= maxDigit){
               maxDigit = last_digit;
           }
           n = n / 10;
       }
        System.out.println(maxDigit);
    }
}
