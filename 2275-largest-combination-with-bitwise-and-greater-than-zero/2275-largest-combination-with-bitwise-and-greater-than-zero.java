class Solution {
    
    
    public int largestCombination(int[] candidates) {
       int ans = 0;
        for(int i = 0; i < 24; i++){
            int cnt = 0;
            for(int no : candidates){
                if((no&(1 << i))  != 0){
                    cnt++;
                }
            }
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}