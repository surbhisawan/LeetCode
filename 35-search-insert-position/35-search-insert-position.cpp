class Solution {
public:
    
    int search(vector<int>& nums,int s, int e, int target){
        if(s>e)
            return s;
        int mid=s+(e-s)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target)
            return search(nums,s,mid-1,target);
        else
            return search(nums,mid+1,e,target);
    }
    
    int searchInsert(vector<int>& nums, int target) 
    {
       int start=0,end=nums.size()-1;
       int ans = search(nums, start,end,target);
        return ans;
        
        

    }
};