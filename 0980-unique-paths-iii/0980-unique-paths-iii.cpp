class Solution {
public:
    
    int dfs(vector<vector<int>>& grid,int x,int y, int empty) {
        if(x<0||x>=grid.size()||y<0||y>=grid[0].size()||grid[x][y]==-1) 
            return 0;
        if(grid[x][y]==2) {
            return empty == -1 ? 1:0;
        }
        grid[x][y]=-1;
        empty--;
        int ans = dfs(grid,x+1,y,empty)+
        dfs(grid,x-1,y,empty)+
        dfs(grid,x,y+1,empty)+
        dfs(grid,x,y-1,empty);
        grid[x][y]=0;
        empty++;
        
        return ans;
    }
    
    int uniquePathsIII(vector<vector<int>>& grid) {
       int x,y,empty=0;
        for(int i=0;i<grid.size();i++) {
            for(int j=0;j<grid[0].size();j++) {
                if(grid[i][j]==1) 
                {
                    x=i,y=j;
                }
                else if(grid[i][j]==0) 
                    empty++;
            }
        }
        return dfs(grid,x,y,empty); 
    }
};