class Solution {
public:
    int findMin(vector<int>& nums) {
        int start=0,end=nums.size()-1;
         if (nums.size() == 1) {
            return nums[0];
        }
        if (nums[end] > nums[0]) {
            return nums[0];
        }

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
    }
};