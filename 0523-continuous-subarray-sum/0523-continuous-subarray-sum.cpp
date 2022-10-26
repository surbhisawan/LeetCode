class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        int sum=0,count=0;
        unordered_map<int,int>mp;
        
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]==0 and nums[i]==0)
                return true;
        }
        
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums[i];
            if(i>0 and sum%k==0)
                return true;
            
            if(mp.count(sum%k))
            {
             if(i-mp[sum%k]>=2)
                 return true;
            }
            else{
                mp[sum%k]=i;
            }
            
        }
        return false;
    }
};