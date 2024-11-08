class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int n = nums.length;
        int xorProduct = 0;
        for(int i = 0; i < n; i++){
            xorProduct ^= nums[i];
        }
        
        int[] ans = new int[n];
        
        int mask = (1<<maximumBit)-1;
        
        for(int i = 0; i < n; i++){
            ans[i] = xorProduct^mask;
            xorProduct ^= nums[n-i-1];
        }
        
        return ans;
    }
}