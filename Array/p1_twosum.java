package Array;

import java.util.HashMap;
import java.util.Map;

public class p1_twosum {

    public static int[] twosum(int arr[], int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (mp.containsKey(compliment)) {
                return new int[] { mp.get(i), i };
            }
            mp.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String args[]) {
        int ar[] = { 1, 2, 3, 4, 5 };
        int k = 7;
        System.out.println(twosum(ar, k));
    }

}
