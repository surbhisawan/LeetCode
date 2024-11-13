class Solution {

    public long solve(int[] nums, int val){
        int left = 0, right = nums.length-1;
        long ans = 0;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum < val){
                ans += (right-left);
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return solve(nums,upper+1) - solve(nums,lower);
    }
}