class Solution {
    
    public boolean dfs(int i, int set, int[][] graph, int[] vis){
        vis[i] = set;
        
        for(int j = 0; j < graph[i].length; j++){
            int node = graph[i][j];
            if(vis[node] == -1){
                if(dfs(node, 1-set, graph, vis)==false){
                    return false;
                }
            }
            
            else if(vis[node] == vis[i]){
                return false;
            }
        }
        return true;
    }
    
    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        int[] vis = new int[n];
        
        for(int i = 0; i < n; i++){
            vis[i] = -1;
        }
        
        for(int i = 0; i < n; i++){
            if(vis[i] == -1){
                if(dfs(i, 0, graph, vis) == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}