class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                cnt++;
            }else{
                nums[idx++] = nums[i];
            }
        }
        
        System.out.print(idx);
        while(cnt > 0){
            nums[idx] = 0;
            idx++;
            cnt--;
        }
        
    }
}