/*
package basics.strings;

import java.util.HashMap;

public class P008_SortCharacters {
    public static char[] frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        return " ";
    }
    public static void main(String[] args) {
        // Write your solution here
        String s = "aabc";
        System.out.println(frequencySort(s));
    }
}
/*
so s. toCharArray() - means ch will go through every character in s string
so after hashmap let's take input aaabbcc : a : 3 b : 2 c : 2

List<Character> list = new ArrayList<>(freqMap.keySet()); so tihs line wil make unique character . so a, b, c wil be out
put

 Collections.sort(list, (a, b) -> {
            if (freqMap.get(b) != freqMap.get(a)) {
                return freqMap.get(b) - freqMap.get(a); // higher frequency first
            }
            return a - b; // alphabetical order
        }); this will take list a , b c and what is (a, b) okay so may be (a, b) is key value which is a : 3 b : 2 c : 2
        okay next line freq.map(b)! = a means i don't understand a thing

        step 4 conver list to array = what is list and array ?

        may be i ll try to write algorithm first.
        take string - make a map a : 3 b : 2 c : 2
        after that count by frequeince 3 2 2 just return string which is a b c if two have same arrange it by ascending
        order.

        so i think i got algorithm but don't know how to count seperate frequencies and sort alphabetically.
 */

