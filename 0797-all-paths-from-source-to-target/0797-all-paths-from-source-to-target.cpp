class Solution {
public:
    
    void dfs(vector<vector<int>>& graph, vector<vector<int>>& ans, vector<int>& path, int idx)    {
        path.push_back(idx);
        if(idx == graph.size()-1){
            ans.push_back(path);
        }else{
            for(auto x:graph[idx]){
                dfs(graph, ans, path, x);
            }
        }
        
        path.pop_back();
   }
    
    
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
       vector<vector<int>> ans;
       vector<int> path;
        
       dfs(graph, ans, path, 0); 
       return ans; 
    }
};