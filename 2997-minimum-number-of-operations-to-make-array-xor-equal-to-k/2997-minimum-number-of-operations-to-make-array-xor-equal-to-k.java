class Solution {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        
        for(int i : nums){
            result = result ^ i;
        }
        
        int cnt = 0;
        
        while(k>0 || result>0){
            
            if((k%2) != (result%2))
                cnt++;
            
            k = k/2;
            result = result/2;
        }
        
        return cnt;
    }
}