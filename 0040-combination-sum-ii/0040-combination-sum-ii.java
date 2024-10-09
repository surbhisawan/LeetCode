class Solution {
    
    public void sum(int idx, int[] candidates, int target, List<List<Integer>> ans,List<Integer> res){
        
            if(target == 0){
                ans.add(new ArrayList<>(res));
                return;    
            }
        
        for(int i = idx; i < candidates.length; i++){
            
            if(i > idx && candidates[i] == candidates[i-1]){
                continue;
            }
            
            if(target < candidates[i]){
               break;
             }
            
               res.add(candidates[i]);
               sum(i+1,candidates,target-candidates[i],ans,res);
               res.remove(res.size()-1);
        }
        
        
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(candidates);
        sum(0,candidates,target,ans,res);
        
        return ans;
    }
}