package Array;

import java.util.Arrays;

public class p5_productArray {

    public static int[] productArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int lp = 1;
        for (int i = 0; i < n; i++) {

            ans[i] = lp;
            lp *= arr[i];
        }
        int rp = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rp;
            rp *= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        System.out.println("Product Array: " + Arrays.toString(productArray(a)));
    }

}
