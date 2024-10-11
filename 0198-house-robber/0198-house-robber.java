class Solution {
    
    public int solve(int idx, int[] nums, int[] dp){
        
        if(idx == 0){
            return nums[idx];
        }
        
        if(idx < 0){
            return 0;
        }
        
        if(dp[idx] != -1){
            return dp[idx];
        }
        
         int left = solve(idx-2, nums, dp) + nums[idx];
        
         int right = solve(idx-1, nums, dp) + 0;
        
        
        
        return dp[idx] = Math.max(left,right);
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n-1 ,nums, dp);
    }
}