package basics.recursion;

import util.FastScanner;

public class P001_SumOfNth {

    // Recursive function to calculate sum of 1 to n
    public static int sum(int n) {
        if(n == 0){
            return 0;
        }
        return sum(n-1) + n;
         // temporary
    }

//    public static void main(String[] args) throws Exception {
//        FastScanner fs = new FastScanner();
//
//        int n = fs.nextInt();   // input n
//        int result = sum(n);    // call recursion
//        System.out.println(result);
//    }
public static void main(String[] args) throws Exception {
    FastScanner fs = new FastScanner();
    int n = fs.nextInt();
    int result = sum(n);
    System.out.println(result);

}

}
