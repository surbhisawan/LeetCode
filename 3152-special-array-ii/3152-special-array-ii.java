class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]%2 ==  nums[i-1]%2){
                prefixSum[i] = prefixSum[i-1]+1;
            }else{
                prefixSum[i] = prefixSum[i-1];
            }
        }
        
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            if(prefixSum[end]-prefixSum[start] == 0){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
            
        }
        return ans;
        
    }
}