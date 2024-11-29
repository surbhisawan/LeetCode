class Pair{
    int time, row, col;

    Pair(int time, int row, int col){
        this.time = time;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int minimumTime(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if(grid[0][1] > 1 && grid[1][0] > 1){
            return -1;
        }

        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};

        boolean[][] vis = new boolean[n][m];
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y)->x.time - y.time);
        q.add(new Pair(grid[0][0],0,0));

        while(!q.isEmpty()){
            int time = q.peek().time;
            int row = q.peek().row;
            int col = q.peek().col;

            q.poll();

            if(row == n-1 && col == m-1){
                return time;
            }

            if(vis[row][col]){
                continue;
            }

            vis[row][col] = true;

            for(int i = 0; i < 4; i++){
                int nr = row + rows[i];
                int nc = col + cols[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc])
                {
                    int waitTime = ((grid[nr][nc] - time)%2 == 0)?1:0; 
                    int nextTime = Math.max(grid[nr][nc]+waitTime,time+1);
                    q.add(new Pair(nextTime,nr,nc));
                }
            }
        }
        return -1;
    }
}