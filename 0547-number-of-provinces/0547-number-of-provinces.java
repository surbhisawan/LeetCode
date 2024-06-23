class Solution {
    
    public static void dfs(int src, ArrayList<ArrayList<Integer>> adj , boolean[] visited){
        visited[src] = true;
        
        for(Integer it : adj.get(src)){
            if(!visited[it]){
                dfs(it, adj, visited);
            }
        }
        
    }
    
    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        int size = isConnected.length;
        
        boolean[] visited = new boolean[size];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < size; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < size; i++){
            for(int  j = 0; j < size; j++){
                if(isConnected[i][j] == 1 & i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        for(int i = 0 ; i < size; i++){
            if(!visited[i]){
                dfs(i, adj, visited);
                cnt++;
            }
        }
        return cnt;
    }
}