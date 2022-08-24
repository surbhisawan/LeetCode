class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int sum = 0;
        vector<int>vec;
        for(auto i:nums){
            sum+=i;
            vec.push_back(sum);
        }
        return vec;
    }
};