class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        n = n/2;
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) > n){
                return i;
            }
        }
        return 1;
    }
}