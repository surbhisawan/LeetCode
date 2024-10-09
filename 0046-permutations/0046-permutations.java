class Solution {
    
    public void solve(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            
            List<Integer> res = new ArrayList<>();
        
            for(int i = 0; i < nums.length; i++){
                res.add(nums[i]);
            }
            
            ans.add(new ArrayList<>(res));
            return;
        }
        
        for(int i = idx; i < nums.length; i++){
            swap(nums,idx,i);
            solve(idx+1,nums,ans);
            swap(nums,idx,i);
        }
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
    
        solve(0,nums,ans);
        return ans;
    }
}