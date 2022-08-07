class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int k=0,i=0;
        int n=nums.size();
        while(i<n){
            if(nums[i]!=0)
                nums[k++]=nums[i];
            i++;
        }
        
        while(k<n){
            nums[k++]=0;
        }
        
    }
};