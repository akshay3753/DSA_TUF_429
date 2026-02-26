package basics.strings;

public class Anagram_array {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagrama";
        System.out.println(isAnagram(s, t));
    }
}
