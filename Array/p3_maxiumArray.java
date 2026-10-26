package Array;

public class p3_maxiumArray {
    public static int maxSum(int arr[]) {
        int current = arr[0];
        int maxSums = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSums = Math.max(maxSums, current);
        }
        return maxSums;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum Sub Array " + maxSum(arr));
    }
}
