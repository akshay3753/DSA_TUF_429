package Strings;

public class reverseWords {
    public static StringBuilder cleanSpaces(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left <= right && s.charAt(left) == ' '){
            left++;
        }

        while ((left <= right && s.charAt(right) == ' ')){
            right--;
        }
        StringBuilder sb = new StringBuilder();

        while (left <= right){
            char c = s.charAt(left);
            if(c != ' '){
                sb.append(c);
            } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            left++;
        }
        return sb;
    }

    public static void reverse(StringBuilder sb, int left, int right){
        while(left < right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    public static String reverseWords(String s){
        StringBuilder sb = cleanSpaces(s);
        reverse(sb, 0, sb.length() - 1);

        int start = 0;
        int end = 0;
        int n = sb.length();

        while (start < n) {
            while (end < n && sb.charAt(end) != ' '){
                end++;
            }
            reverse(sb, start, end - 1);
            start = end + 1;
            end = start;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        // Write your solution here
        String s = " the  sky  ";
        System.out.println(reverseWords(s));
    }
}
