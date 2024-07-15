class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        int len = 0;
        boolean oldfreq = false;
        for(int freq : m.values()){
            if(freq%2 ==0){
                len += freq;
            }else{
                len += freq-1;
                oldfreq = true;
            }
        }
        return oldfreq == true? len + 1: len;
    }
}