class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0;
        
        for(int i = 0; i < k; i++){
            lsum += cardPoints[i];
        }
        
        int n = cardPoints.length;
        
        int maxSum = lsum;
        
        
        int ptr = n-1;
        for(int i = k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[ptr--];
            maxSum = Math.max(maxSum, lsum + rsum);  
            
        }
        
        
        return maxSum;
    }
}