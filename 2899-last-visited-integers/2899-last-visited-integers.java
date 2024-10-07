class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        int k = 0;
        
        // int max = 0;
        
        for(int it : nums){
            if(it != -1 ){
                seen.add(0,it);
                k = 0;
            }else if(++k <= seen.size()){
                ans.add(seen.get(k-1));
            }else{
                ans.add(-1);
            }
        }
    
        return ans;
    }
}