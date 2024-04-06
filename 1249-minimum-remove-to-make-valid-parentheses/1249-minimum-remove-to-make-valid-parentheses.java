class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
    
        
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '('){
                cnt++;
            }else if(sb.charAt(i) == ')' && cnt > 0){
                cnt--;
            }else if(sb.charAt(i) == ')' && cnt == 0){
                sb.delete(i,i+1);
                i--;
            }
        }
        
        for(int i = sb.length()-1; i >= 0; i--){
            if(cnt == 0){
                break;
            }
            if(sb.charAt(i) == '('){
                sb.delete(i,i+1);
                cnt--;
            }
        }
        
        return sb.toString();
    }
}