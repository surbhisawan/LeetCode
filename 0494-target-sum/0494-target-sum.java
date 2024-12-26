class Solution {
    
    int cnt = 0;
    
    public int findTargetSumWays(int[] nums, int target) {
        sum(0,nums,0,target);
        return cnt;
    }
    
    public void sum(int idx, int[] nums, int sum, int target){
        if(idx>=nums.length){
            if(sum == target){
                cnt++;
            }
        }else{
            sum(idx+1,nums,sum+nums[idx],target);
            
            sum(idx+1,nums,sum-nums[idx],target);
        }
    }
    
}