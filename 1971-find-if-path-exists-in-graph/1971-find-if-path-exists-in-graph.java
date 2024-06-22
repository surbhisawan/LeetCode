class Solution {
    
    List<List<Integer>> graph ;
    
    public void solve(int source, boolean[] visited){
         visited[source] = true;
         
        Iterator<Integer> it = graph.get(source).iterator();
        
        while(it.hasNext()){
            int v = it.next();
            
            if(!visited[v]){
                solve(v, visited);
            }
        }
        
    }
    
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        graph = new ArrayList<>(n);
        
        for(int i = 0; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        solve(source, visited);
        
        return visited[destination];
        
    }
}