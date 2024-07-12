class Solution {
    public int majorityElement(int[] nums) {
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int maxValue = Integer.MIN_VALUE;
        int ans = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > maxValue){
                maxValue = m.getValue();
                ans = m.getKey();
            }
        }
        return ans;
    }
}