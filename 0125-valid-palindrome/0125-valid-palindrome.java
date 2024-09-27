class Solution {
    public boolean isAlphaNumeric(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }
    
    public boolean isPalindrome(String s) {
        int size = s.length();
        int first = 0;
        int last = size - 1;
        
        while(first <= last){
            char c1 = Character.toLowerCase(s.charAt(first));
            char c2 = Character.toLowerCase(s.charAt(last));
            
            System.out.println(c1 + " " + c2);
            
            if(!isAlphaNumeric(c1)){
                first++;
            }else if(!isAlphaNumeric(c2)){
                last--;
            }else if(c1 != c2){
                return false;
            }else{
                first++;
                last--;
            }
        }
        return true;
    }
}