class Solution {
    
    public void sum(int idx, int[] candidates, int target, List<List<Integer>> ans, List<Integer> res){
        if(idx == candidates.length){
            if(target == 0){
               ans.add(new ArrayList<>(res));
               return;
            }
            return;
        }
        
        if(target >= candidates[idx]){
            res.add(candidates[idx]);
            sum(idx,candidates, target - candidates[idx] ,ans,res);
            res.remove(res.size()-1);
        }
        
        
        
        //not take
        sum(idx+1,candidates, target ,ans,res);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<Integer>();
        
        sum(0,candidates, target ,ans,res);
        
        return ans;
    }
}