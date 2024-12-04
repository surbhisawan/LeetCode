class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int idx1 = 0, idx2 = 0;
        
        while(idx1 < str1.length() && idx2 < str2.length()){
            
            if(str1.charAt(idx1) == str2.charAt(idx2) || str1.charAt(idx1) + 1 == str2.charAt(idx2) || str1.charAt(idx1) - 25 == str2.charAt(idx2)){
                idx2++;
            }
            
                idx1++;
            
        }
        
        if(idx2 == str2.length()){
            return true;
        }
        return false;
    }
}