class Solution {
public:
    
    int firstOccurence(vector<int>&nums, int key){
        int n=nums.size();
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<key){
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    
    
    int lastOccurence(vector<int>&nums, int key){
        int n=nums.size();
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    
   
    
    vector<int> searchRange(vector<int>& nums, int target) {
        int a=firstOccurence(nums,target);
        int b=lastOccurence(nums,target);
        return {a,b};
    }
};