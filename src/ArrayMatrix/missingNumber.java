package ArrayMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class missingNumber {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 2, 3, 7};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(!set.contains(i)){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
