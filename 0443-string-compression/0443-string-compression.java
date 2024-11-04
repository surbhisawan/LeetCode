class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
       
        if(n == 1){
            return n;
        }
        
        int i = 0, idx = 0;
        
        while(i < n){
            int cnt = 1;
            
            while(i+cnt<n && chars[i] == chars[i+cnt]){
                cnt++;
            }
            
            chars[idx++] = chars[i];
            
            if(cnt > 1){
                for(char ch : Integer.toString(cnt).toCharArray())
                {
                    chars[idx++]=ch;
                }            }
            
            i+=cnt;
        }
        
        
        return idx;
    }
}