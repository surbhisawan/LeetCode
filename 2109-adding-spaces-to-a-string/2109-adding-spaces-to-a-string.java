class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        
        int start = 0;
        for(int i = 0; i < spaces.length; i++){
            str.append(s.substring(start,spaces[i]));
            str.append(" ");
            start = spaces[i];
        }
        
        str.append(s.substring(start,s.length()));
        
        return str.toString();
    }
}