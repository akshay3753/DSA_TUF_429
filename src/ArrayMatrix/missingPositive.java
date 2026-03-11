package ArrayMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class missingPositive {
    public static void main(String[] args) {
        // Write your solution here
        int[] num = {1, 2, 3};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= num.length; i++) {
            if(!set.contains(i)){
                result.add(i);
                break;
            }
        }
        if(result.isEmpty()){
            result.add(num.length + 1);
        }
        System.out.println(result);
    }
}
