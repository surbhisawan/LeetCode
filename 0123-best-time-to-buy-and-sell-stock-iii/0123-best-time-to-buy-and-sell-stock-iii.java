class Solution {
    
    public int solve(int idx, int buy, int[] prices, int[][][]dp, int cap){
        
        if(cap == 0){
            return 0;
        }
        
        if(idx == prices.length){
            return 0;
        }
        
        if(dp[idx][buy][cap]!=-1){
            return dp[idx][buy][cap];
        }
        
        int profit = 0;
        
        if(buy == 1){
            profit = Math.max(-prices[idx]+solve(idx+1,0,prices,dp,cap) , 0 +solve(idx+1,1,prices,dp,cap));
        }else{
             profit = Math.max(prices[idx]+solve(idx+1,1,prices,dp,cap-1) , 0 +solve(idx+1,0,prices,dp,cap) );
        }
        return dp[idx][buy][cap] = profit;
    }
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        
    for (int row1[][] : dp) {
      for (int row2[] : row1) {
        Arrays.fill(row2, -1);
      }
    }
        
        return solve(0,1,prices,dp,2);
    }
}