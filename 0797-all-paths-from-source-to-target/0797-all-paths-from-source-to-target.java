class Solution {
    
    public void dfs(int node, int end, int[][] graph, List<Integer> list, List<List<Integer>> ans, boolean[] vis){
        vis[node] = true;

        list.add(node);
        
        if(node == end){
            ans.add(new ArrayList<>(list));
        }
        
        for(int it : graph[node]){
            if(!vis[it]){
                dfs(it,end,graph,list,ans,vis);
            }
        }
        
        list.remove(list.size()-1);
        vis[node] = false;
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int n = graph.length;
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        boolean[] vis = new boolean[n];
        
        dfs(0,n-1,graph,list,ans,vis);
        
        return ans;
       
    }
}