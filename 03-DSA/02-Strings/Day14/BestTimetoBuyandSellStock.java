
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

        int[] prices = {10, 5, 2, 8, 3};

        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {

            int currentPrice = prices[i];

            // Calculate today's profit
            int profit = currentPrice - min_price;

            // Update maximum profit
            if (profit > max_profit) {
                max_profit = profit;
            }

            // Update minimum buying price
            if (currentPrice < min_price) {
                min_price = currentPrice;
            }
        }

        System.out.println("Maximum Profit: " + max_profit);
    }
}
