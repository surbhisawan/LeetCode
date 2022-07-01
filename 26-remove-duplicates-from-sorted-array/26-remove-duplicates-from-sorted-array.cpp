class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=nums.size();
        int k=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            else
                nums[k++]=nums[i];
        }
        return k;
    }
};