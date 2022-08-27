import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum=0;
        int maxNo=Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            maxNo=Math.max(maxNo, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxNo;
    }
}