class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        int col=matrix[0].size();
        
        int start=0,end=col-1;
        while(start<row && end>=0){
            int element=matrix[start][end];
            if(element==target)
                return 1;
            else if(element<target)
                start++;
            else
                end--;
        }
        return 0;
    }
};