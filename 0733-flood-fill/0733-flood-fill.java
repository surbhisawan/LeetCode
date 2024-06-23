 class Solution {
    
    
    void  dfs(int[][] image, int sr, int sc, int color, boolean[][] visited, int val){
        
        
        
        if(sr < 0 || sr >= image.length || sc < 0 ||  sc >= image[0].length || image[sr][sc] != val ) return;
        
        image[sr][sc] = color;
        
        visited[sr][sc] = true;
        
        
        
        dfs(image, sr - 1, sc , color, visited, val);
        dfs(image, sr + 1, sc , color, visited, val);
        dfs(image, sr, sc - 1 , color, visited, val);
        dfs(image, sr, sc + 1, color, visited, val);
        
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        
        int val = image[sr][sc];
        
        int row = image.length;
        int col = image[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        dfs(image, sr, sc, color, visited, val);
        
        return image;
        
    }
}