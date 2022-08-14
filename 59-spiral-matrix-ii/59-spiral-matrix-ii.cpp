class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        int end=n*n;
        
        vector<vector<int> > ans(n,vector<int>(n));
        int starting_row=0;
        int starting_col=0;
        int ending_row=n-1;
        int ending_col=n-1;
        int count=1;
        while(count<=end){
            for(int i=starting_col;i<=ending_col;i++){
            
                ans[starting_row][i]=count++;
            }
            starting_row++;
            
            for(int i=starting_row;i<=ending_row;i++){
                ans[i][ending_col]=count++;
            }
            ending_col--;
            
            for(int i=ending_col;i>=starting_col;i--){
                ans[ending_row][i]=count++;
            }
            ending_row--;
            
            for(int i=ending_row;i>=starting_row;i--){
                ans[i][starting_col]=count++;
            }
            starting_col++;
        }
        return ans;
    }
};