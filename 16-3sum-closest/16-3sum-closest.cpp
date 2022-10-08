class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int ans=nums[0]+nums[1]+nums[2];
        int curr=0;
        
        int n=nums.size();
        for(int i=0;i<n;i++){
            int j=i+1,k=n-1;
            
            while(j<k){
                curr=nums[i]+nums[j]+nums[k];
                if(abs(curr-target)<abs(ans-target))
                    ans=curr;
                else if(curr>target)
                    k--;
                else
                    j++;
            }
        }
        return ans;
    }
};