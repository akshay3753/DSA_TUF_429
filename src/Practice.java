import util.FastScanner;

import java.util.HashMap;

public class Practice {
    public static String commonPrefix(String[] str) {
        if (str.length == 0) return " ";

        String shortest = str[0];
        for (int i = 1; i < str.length; i++) {
            if(str[i].length() < shortest.length()){
                shortest = str[i];
            }
        }
        String result = "";
        for (int i = 0; i < shortest.length(); i++) {
            char ch = shortest.charAt(i);
            for (int j = 0; j < str.length; j++) {
                if(str[j].charAt(i) != ch){
                    return result;
                }
            }
            result = result + ch;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(commonPrefix(words));
    }
}


