class Solution {
    
    public int checkMax(int[] nums){
        int max = -1;
        for(int it : nums){
            max = Math.max(max,it);
        }
        return max;
    }
    
    public boolean primeSubOperation(int[] nums) {
        int n = checkMax(nums);
        boolean[] number = new boolean[n+1];
        Arrays.fill(number,true);
        number[0] = false;
        number[1] = false;
        
        for(int i = 2; i <= Math.sqrt(n+1); i++){
            if(number[i]){
                for(int j = i*i; j <= n; j+=i){
                    number[j] = false;
                }
            }
        }
        
        int currValue = 1;
        int i = 0;
        
        while(i < nums.length){
            int diff = nums[i] - currValue;
            
            if(diff < 0){
                return false;
            }
            
            if(number[diff] == true || diff == 0){
                currValue++;
                i++;
            }else{
                currValue++;
            }
        }
        
        return true;
        
    }
}