class Solution {
    
    public void dfs(int i, int[][] isConnected, boolean[] vis){
        vis[i] = true;
        
        for(int ptr = 0; ptr < isConnected.length; ptr++ ){
            if(isConnected[i][ptr] == 1 && !vis[ptr]){
                dfs(ptr,isConnected,vis);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
                if(!vis[i]){
                    cnt++;
                    dfs(i,isConnected,vis);
                }
        }
        
        return cnt;
    }
}