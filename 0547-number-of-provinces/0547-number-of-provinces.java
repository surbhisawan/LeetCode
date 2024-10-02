class Solution {
    
    public void dfs(int node, int[][] isConnected, boolean[] vis){
        vis[node] = true;
        
        for(int i = 0; i < isConnected.length; i++){
            if(isConnected[node][i] == 1 && !vis[i]){
                dfs(i,isConnected,vis);
            }
        }
       return;
    }
    
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length; 
        
        boolean[] vis = new boolean[v];
        int cnt = 0;
        
        for(int i = 0; i < v; i++){
            if(!vis[i]){
                dfs(i,isConnected, vis);
                cnt++;
            }
        }
        return cnt;
    }
}