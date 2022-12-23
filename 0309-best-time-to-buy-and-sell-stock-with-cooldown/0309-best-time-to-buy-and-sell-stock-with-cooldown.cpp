class Solution {
public:
    int solve(int idx, int buy, vector<int>& prices, vector<vector<int>>& dp){
        if(idx >= prices.size())
            return 0;
        
        if(dp[idx][buy] != -1){
            return dp[idx][buy];
        }
        
        if(buy == 1)
            return dp[idx][buy] = max(-prices[idx]+solve(idx+1, 0, prices, dp) , solve(idx+1, 1, prices, dp));
        
        
        return dp[idx][buy] = max(prices[idx] + solve(idx+2, 1, prices, dp), solve(idx+1, 0, prices, dp));
    }
    
    
    int maxProfit(vector<int>& prices) {
        vector<vector<int>> dp(prices.size(), vector<int>(2,-1));
        return solve(0,1,prices,dp);
    }
};