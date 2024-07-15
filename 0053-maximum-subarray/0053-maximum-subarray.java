class Solution {
    public int maxSubArray(int[] nums) {
       int l = 0,r = 0;
       int sum = 0, maxSum = Integer.MIN_VALUE; 
        
       while(r < nums.length){
           
           while(sum < 0){
               sum -= nums[l];
               l++;
           }
           sum += nums[r];
           maxSum = Math.max(sum, maxSum);
           r++;
       }
        return maxSum;
    }
}