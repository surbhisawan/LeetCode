class Solution {
    public boolean checkValidString(String s) {
        int opencnt = 0, closecnt = 0;

        int n = s.length() - 1;
        
        for(int i = 0; i <= n; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '*'){
                opencnt++;
            }else{
                opencnt--;
            }
            
            if(s.charAt(n - i) == ')' || s.charAt(n - i) == '*'){
                closecnt++;
            }else{
                closecnt--;
            }
            
            if(opencnt < 0 || closecnt < 0)
                return false;
            
            
        }
        
        
        return true;
    }
}