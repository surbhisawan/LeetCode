class Solution {
    public int dominantIndex(int[] nums) {
        int maxNo = -1,idx = -1;
        for(int i = 0; i < nums.length; i++){
           if(maxNo < nums[i]){
               maxNo = nums[i];
               idx = i;
           }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=maxNo && nums[i]*2 > maxNo){
                return -1;
            }
        }
        return idx;
    }
}