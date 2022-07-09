class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n=nums.size();
        int k=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            nums[k++]=sum;
        }
        return nums;
    }
};