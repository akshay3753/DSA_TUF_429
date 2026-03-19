package Strings;

public class reverseString {
    public static String reverseString(String s){
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        // Write your solution here
        String s = "Akshay";
        System.out.println(reverseString(s));
    }
}
