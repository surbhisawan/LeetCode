class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k > 0){
            int minVal = Integer.MAX_VALUE;
            int idx = -1;
            for(int it = 0; it < nums.length; it++){
                if(minVal > nums[it]){
                    minVal = nums[it];
                    idx = it;
                }
            }
            nums[idx] = nums[idx]  * multiplier;
            k--;
        }
        return nums;
    }
}