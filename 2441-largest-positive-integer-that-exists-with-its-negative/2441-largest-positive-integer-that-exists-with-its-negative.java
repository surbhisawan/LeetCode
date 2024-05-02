class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int i = 0, j = n-1;
        while(i<j){
            if(nums[j] == (-nums[i])){
                return nums[j];
            }else if(nums[j] > (-nums[i])){
                j--;
            }else{
                i++;
            }
        }
        
        
        return -1;
    }
}