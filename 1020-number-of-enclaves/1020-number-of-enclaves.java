class Solution {
    
    public void dfs(int i, int j, int[][] grid, int[][] vis, int[] delrow, int[] delcol){
        vis[i][j] = 1;
        
        for(int it = 0; it < 4; it++){
            int nr = delrow[it] + i;
            int nc = delcol[it] + j;
            
            if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length &&
              grid[nr][nc] == 1 && vis[nr][nc] == 0){
                dfs(nr,nc,grid,vis,delrow,delcol);
            }
         }
    }
    
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] vis = new int[n][m];
        
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};
        
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 1 && vis[i][0] == 0){
                dfs(i,0,grid, vis, delrow, delcol);
            }
            
            if(grid[i][m-1] == 1 && vis[i][m-1] == 0){
                dfs(i,m-1,grid, vis, delrow, delcol);
            }
        }
        
        for(int j = 0; j < m; j++){
            if(grid[0][j] == 1 && vis[0][j] == 0){
                dfs(0,j,grid, vis, delrow, delcol);
            }
            
            if(grid[n-1][j] == 1 && vis[n-1][j] == 0){
                dfs(n-1,j,grid, vis, delrow, delcol);
            }
        }
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && vis[i][j] == 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}