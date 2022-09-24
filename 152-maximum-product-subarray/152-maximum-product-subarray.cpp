class Solution {
public:
    int maxProduct(vector<int>& nums) {
        long int prod = 1;
        long int maxNo = INT_MIN;
        for(int i=0;i<nums.size();i++){
            prod*=nums[i];
            maxNo=max(maxNo,prod);
            if(nums[i]==0){
                prod=1;
            }
        }
        
        prod=1;
        for(int i=nums.size()-1;i>=0;i--)
        {
            prod*=nums[i];
            maxNo=max(maxNo,prod);
            if(nums[i]==0)
            {
                prod=1;
            }
        }
        return maxNo;
    }
};