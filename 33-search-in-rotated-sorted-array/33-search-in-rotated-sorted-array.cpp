class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        int start=0,last=n-1;
        int mid=start+(last-start)/2;
        while(start<=last){
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>=nums[start]){
                if(nums[mid]>target && target>=nums[start]){
                    last=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[last]){
                    start=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
            mid=start+(last-start)/2;
        }
        return -1;
    }
};