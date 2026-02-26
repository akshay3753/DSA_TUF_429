public class PrefixLetters {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String shortestString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (shortestString.length() > strs[i].length()) {
                shortestString = strs[i];
            }
        }

        String result = "";

        for (int i = 0; i < shortestString.length(); i++) {

            for (int j = 0; j < strs.length; j++) {
                if (shortestString.charAt(i) != strs[j].charAt(i)) {
                    return result;   
                }
            }

            // ✅ add ONLY after all strings matched
            result += shortestString.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flowers", "flow", "fly", "flight"};
        System.out.println(longestCommonPrefix(strs)); // fl
    }
}
