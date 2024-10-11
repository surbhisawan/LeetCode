class Solution {
    
    public int solve(int i, int j, List<List<Integer>> triangle, int[][] dp){
        
        if(i == triangle.size()-1){
            return triangle.get(i).get(j);
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int down = triangle.get(i).get(j) + solve(i+1,j,triangle,dp);
        int diagonal = triangle.get(i).get(j) + solve(i+1,j+1,triangle,dp);
        
        return dp[i][j] = Math.min(down,diagonal);
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int[][] dp = new int[n][n];
        
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        
        
        return solve(0,0,triangle,dp);
    }
}