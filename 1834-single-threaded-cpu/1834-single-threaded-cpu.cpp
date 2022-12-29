class Solution {
public:
    vector<int> getOrder(vector<vector<int>>& tasks) {
      for(int i=0;i<tasks.size();i++){
          tasks[i].push_back(i);
      }  
      sort(tasks.begin(), tasks.end());  
        
      int eqTime = 0;
      int idx = 0;
        
      priority_queue<vector<int>, vector<vector<int>>, greater<vector<int>>> pq;
      vector<int> ans;  
      while(ans.size() < tasks.size()){
          if(idx < tasks.size() and pq.empty()){
              eqTime = max(eqTime, tasks[idx][0]);
          }
          
          while(idx < tasks.size() and eqTime >= tasks[idx][0]){
              pq.push({tasks[idx][1], tasks[idx][2]});
              idx++;
          }
          
          auto x = pq.top();
          pq.pop();
          ans.push_back(x[1]);
          eqTime = min(1000000000, x[0]+eqTime);
      }  
        return ans;
    }
};