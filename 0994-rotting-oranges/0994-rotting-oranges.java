class Pair{
    int first;
    int second;
    int time;
    
    Pair(int first, int second, int time){
        this.first = first;
        this.second = second;
        this.time = time;
    }
}

class Solution {
    
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                }
                
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        
        int mintime = 0;    
        int cnt = 0;
        
        while(!q.isEmpty()){
            int first = q.peek().first;
            int second = q.peek().second;
            int time = q.peek().time;
            
            q.poll();
            
            mintime = time;
            
            
            int[] row = {-1,0,1,0};
            int[] col = {0,-1,0,1};
            
            for(int i = 0; i < 4; i++){
                int nr = row[i] + first;
                int nc = col[i] + second;
                
                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1){
                    q.add(new Pair(nr,nc,time+1));
                    grid[nr][nc] = 2;
                    fresh--;
                }
                
            }
            
        }
        
        if(fresh != 0)
            return -1;
        
        return mintime;
    }
}