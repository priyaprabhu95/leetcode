package arrays;

/**
 * Wait until the stock prices go down. Once it's at min, buy, then let it go up.
 * Once it reaches peak, sell. Continue the same
 *
 * Find bottom points and peak points. Buy at every bottom point, sell at every peak point
 */
public class BuySellStocks2 {
    public static void main(String[] args) {
        // int [] prices = new int [] {1, 5, 3, 2, 8, 12};
        // int [] prices = new int [] {10, 20, 30};
        int [] prices = new int [] {30, 20, 10};
        System.out.print(maxProfit(prices));
    }
    private static int maxProfit (int price[]) {
        int profit = 0;
        if (price == null || price.length == 0) {
            return -1;
        }

        if (price.length == 1) {
            return 0;
        }

        for (int i = 1; i < price.length; i++) {
            // Just compare if the graph is going higher and add those to profit.
            // if the graph is going low, ignore
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }
        return profit;
    }
}
