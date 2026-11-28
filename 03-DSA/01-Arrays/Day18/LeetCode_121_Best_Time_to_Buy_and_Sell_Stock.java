public class LeetCode_121_Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            // Step 1: Find the lowest buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Step 2: Calculate today's possible profit
            profit = prices[i] - minPrice;

            // Step 3: Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
