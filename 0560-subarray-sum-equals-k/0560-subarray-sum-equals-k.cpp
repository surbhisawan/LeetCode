class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int count=0;
        int n=nums.size();
        
        int prefix[n];
        prefix[0]=nums[0];
        
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        
        map<int,int>mp;
        for(int i=0;i<n;i++){
            if(prefix[i]==k)
                count++;
            
            if(mp.find(prefix[i]-k)!=mp.end()){
                count+=mp[prefix[i]-k];
            }
            mp[prefix[i]]++;
        }
        return count;
    }
};