class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = Integer.MIN_VALUE;
        int cnt = 0;
        
        for(int i : nums){
            if(i == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            maxOne = Math.max(maxOne, cnt);
        }
        return maxOne;
    }
}