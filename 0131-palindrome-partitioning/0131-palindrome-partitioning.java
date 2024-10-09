class Solution {
    
    public void palindrome(int idx, String s, List<List<String>> ans, List<String> res){
        if(idx == s.length()){
            ans.add(new ArrayList<>(res));
        }
        
        for(int i = idx; i < s.length(); i++){
            if(isPalindrome(s,idx,i)){
                res.add(s.substring(idx, i+1));
                palindrome(i+1,s,ans,res);
                res.remove(res.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        
        palindrome(0,s,ans,res);
        
        return ans;
    }
}