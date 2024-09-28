class Solution {
    
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> arr = new ArrayList<>();
    
    public void subset(int[] nums, int idx){
        
        if(idx >= nums.length){
            list.add(new ArrayList<>(arr));
            return;
        }
        
        //take
        arr.add(nums[idx]);
        subset(nums,idx+1);
        arr.remove(arr.size()-1);
        
        //not take
        subset(nums,idx+1);
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        subset(nums, 0);
        
        return list;
    }
}