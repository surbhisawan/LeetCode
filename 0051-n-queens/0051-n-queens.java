class Solution {
    
    public boolean isSafe(char[][] board, int row, int col, int n){
        
        int dupRow = row;
        int dupCol = col;
        
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        
        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        
        while(col>=0 && row < n){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
            row++;
        }
        
        return true;
        
    }
    
    
    public void solve(int col, char[][] board, int n, List<List<String>> ans){
        if(col == n){
            ans.add(constructSolution(board));
            return;
        }
        
        for(int row = 0; row < n; row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                solve(col+1,board,n,ans);
                board[row][col] = '.';
            }
        }
        
    }
    
    public List<String> constructSolution(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        
        solve(0,board,n,ans);
        
        return ans;
        
    }
}