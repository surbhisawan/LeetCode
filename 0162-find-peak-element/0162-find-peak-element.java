class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0, j = nums.length-1;
        int mid = i + (j-i)/2;
        
        if(nums.length == 1){
            return 0;
        }
        
        while(i < j){
            if(nums[mid] < nums[mid+1]){
                i = mid + 1;
            }else{
                j = mid;
            }
            mid = i + (j-i)/2;
        }
        return j;
    }
}