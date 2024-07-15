class Solution {
    
    public boolean isAlphanumeric(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
    
    
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
    
        while(l < r){
            char c1 = Character.toLowerCase(s.charAt(l));
            char c2 = Character.toLowerCase(s.charAt(r));
            
            
           
            if(!isAlphanumeric(c1)){
                l++;
            }else if(!isAlphanumeric(c2)){
                r--;
            }else if(c1 != c2){
                   return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}