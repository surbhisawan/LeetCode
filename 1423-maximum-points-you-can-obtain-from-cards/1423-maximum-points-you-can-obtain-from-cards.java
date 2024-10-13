class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int lsum = 0;
        
        for(int i = 0; i < k; i++){
            lsum += cardPoints[i];
        }
        
        int idx = cardPoints.length - 1;
        int rsum=0, maxi = lsum;
        for(int j = k-1; j >= 0; j--){
            lsum -= cardPoints[j];
            rsum += cardPoints[idx--];
            
            maxi = Math.max(maxi,lsum+rsum);
        }
        
        return maxi;
    }
}