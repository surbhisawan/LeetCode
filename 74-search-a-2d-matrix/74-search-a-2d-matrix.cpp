class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        int col=matrix[0].size();
        
        int start=0,end=row*col-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int rowIndex=mid/col;
            int colIndex=mid%col;
            int element = matrix[rowIndex][colIndex];
            
            if(element==target)
                return 1;
            else if(element>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return 0;
    }
};