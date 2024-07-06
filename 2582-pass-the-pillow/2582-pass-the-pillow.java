class Solution {
    public int passThePillow(int n, int time) {
     
        int completeRound = time / (n-1);
        
        int extraTime = time % (n-1);
        
        if(completeRound % 2 == 0)
            return extraTime + 1;
        
        return n - extraTime;
        
    }
}