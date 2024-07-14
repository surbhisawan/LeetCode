class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(i!=j && nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
         for(int i = 0 ; i < nums.length; i++){
             map.put(nums[i], i);
        }
        
        for(int i = 0 ; i < nums.length; i++){
            int sum = target - nums[i];
            if(map.containsKey(sum) && map.get(sum) != i){
                return new int[] {i,map.get(sum)};
            }
        }
        return null;
    }
}