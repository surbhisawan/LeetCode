class Pair{
    int first;
    int second;
    int step;
    
    Pair(int first, int second, int step){
        this.first = first;
        this.second = second;
        this.step = step;
    }
}


class Solution
{
    
    public int[][] updateMatrix(int[][] grid)
    {
        // Code here
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        
        boolean[][] vis = new boolean[row][col];
        int[][] dist = new int[row][col];
        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 0){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = true;
                    dist[i][j] = 0;
                }
            }
        }
        
        while(!q.isEmpty()){
            int first = q.peek().first;
            int second = q.peek().second;
            int step = q.peek().step;
            
            int[] rows = {-1,0,1,0};
            int[] cols = {0,-1,0,1};
            
            for(int i = 0; i < 4; i++){
                int nr = rows[i] + first;
                int nc = cols[i] + second;
                
                if(nr >= 0 && nr < row && nc >= 0 && nc < col &&
                   grid[nr][nc] == 1  && !vis[nr][nc]){
                       q.add(new Pair(nr,nc,step+1));
                       vis[nr][nc] = true;
                       dist[nr][nc] = step+1;
                   }
                
            }
            q.poll();
        }
        return dist;
        
    }
}