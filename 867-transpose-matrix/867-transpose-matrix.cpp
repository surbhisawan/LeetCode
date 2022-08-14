class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int row=matrix.size();
        int col=matrix[0].size();
        
        if(row!=col){
            vector<vector<int>>ans(col,vector<int>(row));
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][i]=matrix[i][j];
            }
        }
            return ans;
        }
        
        else{
        
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        }
        return matrix;
    }
};