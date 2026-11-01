package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class p6_movezero {
    public static int[] movezero(int arr[]) {
        int n = arr.length;
        int z = 0;
        int ans[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[k++] = arr[i];
            } else {
                z++;
            }
        }

        for (int i = 0; i < z; i++) {
            ans[k++] = 0;
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 0, 0, 0, 2 };
        System.out.println("Move zero end " + Arrays.toString(movezero(arr)));
    }

}
