class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int k=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
                arr[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2==1)
                arr[k++]=nums[i];
        }
        
        
        return arr;
    }
}