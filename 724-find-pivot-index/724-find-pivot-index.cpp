class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n=nums.size();
        int sum = accumulate(nums.begin(),nums.end(),0);
        
        int lsum=0;
        for(int i=0;i<n;i++){
            if(lsum==sum-lsum-nums[i])
                return i;
            lsum+=nums[i];    
        }
        
        return -1;
    }
};