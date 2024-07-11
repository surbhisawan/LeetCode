class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void solve(int idx , int[] nums, ArrayList<Integer> list){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[idx]);
        solve(idx+1, nums, list);
        list.remove(list.size() - 1);
        
        //not pick
        solve(idx+1, nums, list);
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        solve(0, nums, list);
        
        return ans;
    }
}