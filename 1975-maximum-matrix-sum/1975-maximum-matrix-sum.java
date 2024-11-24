class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negCnt = 0;
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sum += Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    negCnt++;
                }
                 minVal = Math.min(minVal,Math.abs(matrix[i][j]));
            }
        }
        
        if(negCnt%2 != 0){
            sum = sum - 2*minVal;
        }
        
        return sum;
    }
}