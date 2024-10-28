class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0, maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);
            profit = prices[i]-buy;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}