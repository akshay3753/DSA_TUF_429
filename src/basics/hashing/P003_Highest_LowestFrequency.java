package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class P003_Highest_LowestFrequency {
    public static int sumHighLow(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
            }
        }

        int leastFreq = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() < leastFreq){
                leastFreq = entry.getValue();
            }
        }
        return leastFreq + maxFreq;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 1, 2, 3, 3, 3, 4 ,4, 4, 4 };
        System.out.println(sumHighLow(arr));
    }
}
