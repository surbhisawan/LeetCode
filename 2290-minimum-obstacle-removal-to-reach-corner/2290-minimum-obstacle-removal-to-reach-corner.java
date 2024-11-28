class Pair{
    int obs;
    int row;
    int col;
    
    Pair(int obs, int row, int col){
        this.obs = obs;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        int[][] minObs = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                minObs[i][j] = Integer.MAX_VALUE;
            }
        }
        
        minObs[0][0] = 0;
        
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        Deque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0,0,0));
        
        while(!q.isEmpty()){
            int obs = q.peek().obs;
            int row = q.peek().row;
            int col = q.peek().col;
            
            q.poll();
            
            for(int i = 0; i < 4; i++){
                int nr = row + rows[i];
                int nc = col + cols[i];
                
                if(nr>=0 && nc>=0 && nr<m && nc<n && minObs[nr][nc] == Integer.MAX_VALUE){
                    if(grid[nr][nc]==1){
                        minObs[nr][nc] = obs+1;
                        q.addLast(new Pair(obs+1,nr,nc));
                    }else{
                        minObs[nr][nc] = obs;
                        q.addFirst(new Pair(obs,nr,nc));
                    }
                }
                
            }
            
        }
        return minObs[m-1][n-1];
    }
}