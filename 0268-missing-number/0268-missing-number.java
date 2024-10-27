class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int no = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < n ; i++){
            if(no == nums[i]){
                no++;
            }
        }
        
        return no;
    }
}