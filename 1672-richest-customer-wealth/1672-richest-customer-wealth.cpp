class Solution {
public:
    int maximumWealth(vector<vector<int>>& acc) {
        int row=acc.size();
        int col=acc[0].size();
        
        int maxWealth=INT_MIN;
        
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=acc[i][j];
            }
            maxWealth = max(sum,maxWealth);
        }
        return maxWealth;
    }
};