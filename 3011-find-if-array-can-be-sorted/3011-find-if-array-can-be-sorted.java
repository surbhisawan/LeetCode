class Solution {
    public boolean canSortArray(int[] nums) {
        
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int it : nums){
            map.put(it,Integer.bitCount(it));
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > nums[j]){
                    if(map.get(nums[i]) != map.get(nums[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}