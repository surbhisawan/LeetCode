class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& matrix, int r, int c) {
        int row = matrix.size();
        int col = matrix[0].size();
        
        int total  = row*col;
        
        if(r*c!=total)
            return matrix;
        
        vector<vector<int>> ans(r,vector<int>(c));
        vector<int> res;
        for(int i=0;i<total;i++){
        ans[i/c][i%c]=matrix[i/col][i%col];
        }
        return ans;
    }
};