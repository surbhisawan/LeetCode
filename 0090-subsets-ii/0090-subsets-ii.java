class Solution {
    
     public void solve(int idx, int[] nums, List<List<Integer>> ans, List<Integer> res){
        
         ans.add(new ArrayList<>(res));
        
         for(int i = idx; i < nums.length; i++){
             if(i != idx && nums[i] == nums[i-1]){
                 continue;
             }
             
             res.add(nums[i]);
             solve(i+1,nums,ans,res);
             res.remove(res.size()-1);
         }
       
    }
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(nums);
        solve(0,nums,ans,res);
        
        return ans;
    }
}