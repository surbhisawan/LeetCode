class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] ans = new int[n];
        
        int[] left = new int[n];
        left[0] = 1;
        
        int[] right = new int[n];
        right[n-1] = 1;
        
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }
        
        for(int i = 0; i < n; i++){
            ans[i] = left[i]*right[i];
        }
        
        //do not work in case of 0 in the arr
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         ans[i] = prod;
        //     }else{
        //      ans[i] = prod/nums[i];   
        //     }
        // }
        
        
        
        
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(i!=j){
        //             prod *= nums[j];
        //         }
        //     }
        //     ans[i] = prod;
        //     prod = 1;
        //}
        
        
        return ans;
    }
}