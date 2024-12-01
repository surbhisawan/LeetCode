class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
       
        for(int it : nums){
            set.add(it);
        }
        
        for(int it : nums){
            if(set.contains(original)){
                original = 2*original;
            }
            set.add(it);
        }
        return original;
    }
}