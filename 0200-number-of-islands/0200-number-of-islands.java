
class Solution {
    
    
    void dfs(int i, int j, char[][]grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return ;
        }
        
        grid[i][j] = '0';
        dfs(i - 1 , j, grid);
        dfs(i + 1, j, grid);
        dfs(i , j + 1, grid);
        dfs(i , j - 1, grid);
    }
        
    
    public int numIslands(char[][] grid) {
        
        if(grid == null || grid.length == 0)
            return 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        int cnt = 0;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
            if(grid[i][j] == '1')
            {
                cnt++;
                dfs(i, j, grid);
            }
            }
        }
        
        return cnt;
    }
}