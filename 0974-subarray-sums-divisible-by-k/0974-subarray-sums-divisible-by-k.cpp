class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int sum = 0, ans = 0;
        vector<int> count(k);
        count[sum]++;
        for(int i=0;i<nums.size();i++){
            sum=(sum + nums[i])%k;
            if(sum<0)
                sum+=k;
            ans += count[sum];
            count[sum]++;
        }
        return ans;
    }
};