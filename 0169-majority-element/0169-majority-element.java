class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int maxValue = Integer.MIN_VALUE;
        int ans = 0;
        n = n/2;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > n){
                ans = m.getKey();
            }
        }
        return ans;
    }
}