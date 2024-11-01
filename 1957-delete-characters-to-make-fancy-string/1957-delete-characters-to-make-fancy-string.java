class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();

        int n = s.length();
        char prev = s.charAt(0);
        int freq = 1;
        str.append(s.charAt(0));
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == prev){
                freq++;
            }else{
                prev = s.charAt(i);
                freq = 1;
            }
            
            if(freq < 3){
                str.append(s.charAt(i));
            }
        }
        
        return str.toString();
    }
}