package basics.strings;

public class P006_RotatedString {
    public static boolean isRotated(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        String combined = s + s;
        if(combined.contains(t)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Write your solution here
        String s = "abcd";
        String goal = "bcdf";
        System.out.println(isRotated(s, goal));
    }
}
