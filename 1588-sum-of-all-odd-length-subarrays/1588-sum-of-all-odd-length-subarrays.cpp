class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int n=arr.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int count = ceil(((i+1)*(n-i))/2.0);
            ans+=(count*arr[i]);
        }
        return ans;
    }
};