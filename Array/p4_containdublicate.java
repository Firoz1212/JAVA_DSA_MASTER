package Array;

import java.util.*;

public class p4_containdublicate {
    public static boolean dublicate(int arr[]) {
        Set<Integer> s = new HashSet<>();
        for (int i : arr) {
            if (!s.add(i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println("Dublicate " + dublicate(arr));
    }
}
