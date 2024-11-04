class Solution {
    public String compressedString(String word) {
        
        StringBuilder s = new StringBuilder();
        
        int i = 0;
        
        while(i < word.length()){
            int cnt = 0;
            
            char curr = word.charAt(i);
            
            while(i < word.length() && cnt < 9 && curr == word.charAt(i)){
                cnt++;
                i++;
            }
            
            s.append(cnt).append(curr);
            
            
        }
        return s.toString();
    }
}