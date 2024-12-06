class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int it : banned){
            set.add(it);
        }
        
        int cnt = 0;

        for(int i = 1; i <= n; i++){
           if(set.contains(i))
               continue;
            
            if(maxSum-i<0)
                return cnt;
            
            maxSum-=i;
            cnt++;
        }
        return cnt;
    }
}