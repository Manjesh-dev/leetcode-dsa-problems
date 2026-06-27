class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, profit);
            // if (profit > maxProfit) {
            //     maxProfit = profit;
            // }
        }
        return maxProfit;
    }
}