class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int n = gain.size();
        int sum=0, maxNo=0;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            maxNo=max(maxNo,sum);
        } 
        return maxNo;
    }
};