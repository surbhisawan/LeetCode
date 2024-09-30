class Solution {
    
    public void sum(int[] candidates, int idx, int target, List<List<Integer>> list, List<Integer> ans){
        if(idx == candidates.length){
            if(target == 0){
                list.add(new ArrayList<>(ans));
            }
            return;
        }
        
        if(target >= candidates[idx]){
        ans.add(candidates[idx]);
        sum(candidates,idx,target-candidates[idx],list,ans);
        ans.remove(ans.size()-1);
        }
        
        //not take
        sum(candidates,idx+1,target,list,ans);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        sum(candidates,0,target,list,ans);
        
        return list;
    }
}