package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class P002_SecondHighestElement {
    public static int secondOccuringElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        int maxFreq = 0;


        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }
        int secondMax = 0;
        int answer = 0;
        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            int freq = entry.getValue();
            if(freq < maxFreq && freq > secondMax) {
                secondMax = entry.getValue();
                answer = entry.getKey();
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4,  4, 4, 4, 4, 4,};
        System.out.println(secondOccuringElement(arr));
    }
}
