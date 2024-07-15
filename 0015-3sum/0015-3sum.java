class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        
        HashSet<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        for(int i = 0; i < nums.length - 2; i++){
            left = i+1;
            right = nums.length - 1;
            int sum = 0;
            
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(nums[i] + nums[left] + nums[right] == 0){
                    list.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}