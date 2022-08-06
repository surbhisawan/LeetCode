class Solution {
public:
    int searchInsert(vector<int>& nums, int target) 
    {
       int start=0,last=nums.size()-1;
        int ans=0;
        while(start<=last)
        {
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return start;
    }
};