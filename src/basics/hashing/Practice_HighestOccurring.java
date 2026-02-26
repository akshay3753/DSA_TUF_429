package basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class Practice_HighestOccurring {
    public static int highestOccuringElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        // This will create a map variable that stores as key value

        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0 ) + 1);
        }
        // this will loop through the array and take num whick key and assign it value
        //map.put - is used to put in hash map. (first num, and then map.getOrDefault get let's say 1 will get it
        // if if it is 0 which is 1 st iteration will have 0 and adds 1 .
        // if it's already there then num with 1 will add 1 and put 2 in hash map

        int maxFreq = 0;
        int answer = arr[0];

        // for now maxFreq = 0 . because we are yet to find.
        // answer is 1st value . if we find something greater then it is
        // this for loop will iterate through hashmap {1: 2 , 2 : 3 , 3 : 1} and gives answer 2 which is the answer

        // so my guess is if Map.Entry will take each entry i.e 1 : 2 and compare with entrie set entry : map.entrySet()
        //if (entry.get value() mean 2 : in 1st iteration then it will get the max value . so getValue() is the syntax for
        // getting value getKey() is syntax for getting key. entrySet() for total hashmap. Map.Entry is like i so that it
        // can get just value for each iteration .
        for(Map.Entry<Integer, Integer > entry: map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }
        return answer;  // temporary
    }
    public static void main(String[] args) {
        // Write your solution here

        int[] arr = {1, 2 , 2 , 2 , 1, 3};
        System.out.println(highestOccuringElement(arr)); // fl

    }
}
