class Solution {
public:
    
    int firstOccurance(vector<int>nums, int n,int target){
        int s=0,e=n-1,mid;
        int ans=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
    
    int lastOccurance(vector<int>nums, int n,int target){
        int s=0,e=n-1,mid;
        int ans=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
    
    vector<int> searchRange(vector<int>& nums, int target) {
        int n=nums.size();
        int a = firstOccurance(nums, n, target);
        int b = lastOccurance(nums, n, target);
        return {a,b};
    }
};