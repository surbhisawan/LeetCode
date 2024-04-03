class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        
        int cnt = 0;
        
        for(int row = 0; row < words.length; row++){
            for(int col = 0; col < words[row].length(); col++ ){
                if(!set.contains(words[row].charAt(col))){
                    break;
                }
                
                if(col == words[row].length() - 1){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}