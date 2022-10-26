class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        int sum=0,p=0;
        unordered_set<int> st;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            int ans = k? sum%k : sum;
            if(st.count(sum%k))
                return true;
            st.insert(p);
            p=ans;
        }
        return false;
    }
};