class Solution {
    
    public int solve(int idx, int n, int[] nums, int[] dp){
        if(idx >= n){
            return 0;
        }
    
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        //pick
         int pick = nums[idx]  + solve(idx+2, n, nums, dp);
  
        //not pick
        int notpick = 0 + solve(idx+1,n, nums, dp);
        
        return  dp[idx] = Math.max(pick, notpick);
    }
    
    
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n==1)
            return nums[0];
        
        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);        
        int a = solve(0,n-1, nums, dp);
        
        Arrays.fill(dp, -1);
        int b = solve(1,n, nums, dp);
        
        return Math.max(a, b);
        
    }
}