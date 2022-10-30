class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int row=mat.size();
        int col=mat[0].size();
        
        priority_queue<pair<int,int>> q;
        vector<int>ans;
        
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            q.push({count,i});
            if(q.size()>k)
                q.pop();
        }
        
        while(!q.empty()){
            ans.push_back(q.top().second);
            q.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};