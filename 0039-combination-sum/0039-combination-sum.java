class Solution {
    
    List<List<Integer>> ans= new ArrayList<>() ;
    
    public void sum(int index, List<Integer> list, int[] candidates, int target){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return ;
        }
        
        
        if(candidates[index] <= target){
            list.add(candidates[index]);
            sum(index,list,candidates,target-candidates[index]);
            list.remove(list.size() - 1);
        }
        
        
        
        sum(index+1, list, candidates, target);
        
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<Integer>();
        
        sum(0, list, candidates,target);
        
        return ans;
    }
}