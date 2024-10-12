class Solution {
    
    public int solve(int idx, int buy, int[] prices, int[][]dp){
        if(idx >= prices.length){
            return 0;
        }
        
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        
        int profit = 0;
        
        if(buy == 1){
            profit = Math.max(-prices[idx]+solve(idx+1,0,prices,dp) , 0 +solve(idx+1,1,prices,dp) );
        }else{
             profit = Math.max(prices[idx]+solve(idx+2,1,prices,dp) , 0 +solve(idx+1,0,prices,dp) );
        }
        return dp[idx][buy] = profit;
    }
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int[][] dp = new int[n+1][2];
        
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        
        return solve(0,1,prices,dp);
    }
}