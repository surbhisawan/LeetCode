 class Solution {
    
    
    void  dfs(int[][] image, int sr, int sc, int color,  int val){
        
        
        
        if(sr < 0 || sr >= image.length || sc < 0 ||  sc >= image[0].length || image[sr][sc] != val ) return;
        
        image[sr][sc] = color;
        
        dfs(image, sr - 1, sc , color, val);
        dfs(image, sr + 1, sc , color,val);
        dfs(image, sr, sc - 1 , color, val);
        dfs(image, sr, sc + 1, color,  val);
        
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        
        int val = image[sr][sc];
        
        dfs(image, sr, sc, color, val);
        
        return image;
        
    }
}