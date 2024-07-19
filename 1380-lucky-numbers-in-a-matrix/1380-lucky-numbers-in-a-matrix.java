class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> rowMin = new ArrayList<>();
        for(int i = 0 ; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                min = Math.min(matrix[i][j], min);
            }
            rowMin.add(min);
        }
        
        List<Integer> maxCol = new ArrayList<>(); 
        for(int i = 0 ; i < matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < matrix.length; j++){
                max = Math.max(matrix[j][i], max);
            }
            maxCol.add(max);
        }
        
        System.out.println(maxCol);
        System.out.println(rowMin);
        
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == rowMin.get(i) && matrix[i][j] == maxCol.get(j)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}