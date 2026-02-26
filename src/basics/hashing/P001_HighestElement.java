package basics.hashing;

import util.FastScanner;

import java.util.HashMap;

public class P001_HighestElement {
    public static void main(String[] args)throws Exception {
        // Write your solution here
        HashMap<Integer, Integer> map = new HashMap<>();

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fs.nextInt();
        }

        for (int x: arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int maxFreq = -1;
        int bestElement = Integer.MAX_VALUE;
        for(int key: map.keySet()){
            int freq = map.get(key);

            if(freq > maxFreq){
                maxFreq = freq;
                bestElement = key;
            }
            else if(freq == maxFreq && key < bestElement){
                bestElement = key;
            }
        }

        System.out.println(bestElement);

    }
}
