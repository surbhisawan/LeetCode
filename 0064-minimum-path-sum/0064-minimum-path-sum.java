class Solution {
    
    public int solve(int i, int j, int[][] grid, int[][] dp){
        if(i==0 && j==0){
            return grid[0][0];
        }
        
        if(i < 0 || j < 0){
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int up =  Integer.MAX_VALUE;
            if(i > 0){
                up = grid[i][j] + solve(i-1,j,grid,dp);
            }
            
        int left = Integer.MAX_VALUE;
        if(j > 0){
          left = grid[i][j] + solve(i,j-1,grid,dp);  
        } 
        
        return dp[i][j] = Math.min(up,left);
        
    }
    
    public int minPathSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] dp = new int[n][m];
        
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        
        return solve(n-1,m-1,grid,dp);
    }
}