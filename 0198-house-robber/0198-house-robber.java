class Solution {
    
    public int solve(int idx, int[] nums, int[] dp){
        if(idx == 0){
            return nums[idx];
        }
        
        if(idx<0)
            return 0;
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        //pick
         int pick = nums[idx]  + solve(idx-2, nums, dp);
  
        //not pick
        int notpick = 0 + solve(idx-1, nums, dp);
        
        return  dp[idx] = Math.max(pick, notpick);
    }
    
    
    public int rob(int[] nums) {
        
        int n = nums.length-1;
        
        int[] dp = new int[nums.length + 1];
        
        Arrays.fill(dp,-1);
        
        return solve(n, nums, dp);
    }
}

