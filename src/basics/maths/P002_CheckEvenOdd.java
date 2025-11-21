package basics.maths;

public class P002_CheckEvenOdd {

    public static void main(String[] args) {
        System.out.println(isEven(4));   // true
        System.out.println(isEven(7));   // false
        System.out.println(isEven(0));   // true
        System.out.println(isEven(-12)); // true
        System.out.println(isEven(-5));  // false
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
