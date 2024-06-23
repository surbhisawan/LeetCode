class Pair{
    int first;
    int second;
    int time;
    
    public Pair(int first, int second, int time){
        this.first = first;
        this.second = second;
        this.time = time;
    }
}


class Solution {
    
    public int orangesRotting(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        
        int cntFresh = 0;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j,0));
                }
                
                if(grid[i][j] == 1)
                    cntFresh++;
                
            }
        }
        
        int[] delRow = {-1,0,+1,0};
        int[] delCol = {0,-1,0,+1};
        
        int minTime = 0, cnt = 0;
        
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().time;
            q.poll();
            
            minTime = Math.max(t, minTime);
                
            for(int i = 0; i < 4 ; i++){
                int nr = delRow[i] + r;
                int nc = delCol[i] + c;
                
                if(nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1){
                    q.offer(new Pair(nr,nc,t+1));
                    grid[nr][nc] = 2;
                    cnt++;
                }
            }     
        }
     
        
        if(cnt != cntFresh){
            return -1;
        }
        
        
        return minTime;
    }
}