class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int r=matrix.size();
        int c=matrix[0].size();

        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        
        for(int i=0;i<r;i++){
            int left=0,right=c-1;
            while(left<=right){
                swap(matrix[i][left], matrix[i][right]);
                left++;
                right--;
            }
        }
        
    }
};