class Solution {
    public long minimumSteps(String s) {
        
        long blackball = 0;
        long cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                cnt += blackball;
            }else{
                blackball++;
            }
        }
        
        return cnt;
    }
}