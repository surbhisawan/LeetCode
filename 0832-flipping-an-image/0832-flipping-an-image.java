class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        
        int temp = 0;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c/2; j++){
                temp = image[i][j];
                image[i][j] = image[i][c-1-j];
                image[i][c-1-j] = temp;
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                image[i][j] = image[i][j] == 0 ? 1:0;
            }
        }
        return image;
    }
}