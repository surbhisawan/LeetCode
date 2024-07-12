class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
    
        n = n/3;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
                if(m.getValue() > n){
                    ans.add(m.getKey());
                }
        }
        return ans;
    }
}