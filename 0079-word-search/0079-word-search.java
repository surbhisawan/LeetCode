class Solution {
    
    public boolean dfs(char[][] board, int row, int col, int idx , String word){
        
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col]!=word.charAt(idx))
            return false;
        
        if(idx == word.length()-1)
            return true;
        
        char temp = board[row][col];
        board[row][col] = '*';
        
        boolean ans = dfs(board, row+1, col, idx+1, word) ||
                      dfs(board, row-1, col, idx+1, word) ||
                      dfs(board, row, col+1, idx+1, word) ||
                      dfs(board, row, col-1, idx+1, word) ;
        
        board[row][col] = temp;
        
        return ans;
        
        
    }
    
    
    public boolean exist(char[][] board, String word) {
        int rowsize = board.length;
        int colsize = board[0].length;
        
        for(int row = 0; row < rowsize; row++){
            for(int col = 0; col < colsize; col++){
                if(dfs(board,row,col,0,word))
                    return true;
            }
        }
        return false;
    }
}