class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, i = 0;
        int n = nums.length;
        int maxi = 0;
        for(int it : nums){
            if(it == 1){
                sum = sum+1;
                maxi = Math.max(maxi,sum);
            }else {
                sum = 0;
            }
        }
        return maxi;
    }
}