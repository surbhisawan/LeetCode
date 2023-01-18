class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int sum = 0, minSum = INT_MAX, maxSum = INT_MIN, curMax = 0, curMin = 0;
        for(auto ptr : nums){
            sum += ptr;
            curMax = max(curMax + ptr, ptr);
            curMin = min(curMin + ptr, ptr);
            maxSum = max(maxSum, curMax);
            minSum = min(minSum, curMin);
        }
        return (maxSum > 0) ? (max(maxSum, sum - minSum)) : maxSum;
    }
};