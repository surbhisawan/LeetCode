class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int start=0,end=nums.size()-1;
        vector<int>v;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[start]+nums[end]==target)
            {
                v.push_back(start+1);
                v.push_back(end+1);
                break;
            }
            else if(nums[start]+nums[end]>target)
                end--;
            else
                start++;
        }
        return v;
    }
};