class Solution {
public:
    vector<int> findBall(vector<vector<int>>& grid) {
        vector<int> ans(grid[0].size(),0);
        for(int i=0;i<grid[0].size();i++)
        {
            int cur_col=i;
            for(int j=0;j<grid.size();j++)
            {
                int nextCol = cur_col+grid[j][cur_col];
                if(nextCol<0 || nextCol>grid[0].size()-1 || grid[j][cur_col]!=grid[j][nextCol] )
                {
                    ans[i]=-1;
                    break;
                }
                ans[i]=nextCol;
                cur_col=nextCol;
            }
        }
        return ans;
    
    }
};