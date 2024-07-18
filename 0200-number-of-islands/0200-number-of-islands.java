class Pair{
    int src;
    int dest;
    
    Pair(int src, int dest){
        this.src = src;
        this.dest = dest;
    }
}

class Solution {
    // Function to find the number of islands.
    public void solve(int i, int j, char[][] grid){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        grid[i][j] = '0';
        
        
        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};
        
        while(!q.isEmpty()){
            int r = q.peek().src;
            int c = q.peek().dest;
            
            q.poll();
            
            for(int a = 0; a<4 ; a++){
                    int nr = r + row[a];
                    int nc = c + col[a];
                    
                    if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length &&
                      grid[nr][nc] == '1'){
                          grid[nr][nc] = '0';
                          q.add(new Pair(nr,nc));
                      }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int row = grid.length;
        int col = grid[0].length;
        
        int cnt = 0;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    cnt++;
                    solve(i, j, grid);
                }
            }
        }
        return cnt;
    }
}