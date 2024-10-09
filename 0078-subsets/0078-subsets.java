class Solution {
    
    public void solve(int idx, int[] nums, List<List<Integer>> ans, List<Integer> res){
        if(idx == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        
        res.add(nums[idx]);
        solve(idx+1,nums,ans,res);
        res.remove(res.size()-1);
        
        solve(idx+1,nums,ans,res);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        solve(0,nums,ans,res);
        
        return ans;
    }
}