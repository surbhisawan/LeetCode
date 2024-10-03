class Solution {
    
    public void dfs(int i, int j, int color, int[][] image, int hasColor){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != hasColor){
            return;
        }
        
        
        image[i][j] = color;
        
        dfs(i+1,j,color,image,hasColor);
        dfs(i,j+1,color,image,hasColor);
        dfs(i-1,j,color,image,hasColor);
        dfs(i,j-1,color,image,hasColor);
        
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
            return image;
        
        int hasColor = image[sr][sc];
        
        dfs(sr,sc,color,image,hasColor);
        
        
        return image;
    }
}