package Array;

import java.util.Arrays;

public class p2_buys_sells {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int bestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - minPrice;
            if (profitToday > bestProfit) {
                bestProfit = profitToday;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return bestProfit;
    }

    public static void main(String args[]) {
        int ar[] = { 1, 2, 3, 4, 5 };

        System.out.println(maxProfit(ar));
    }
}
