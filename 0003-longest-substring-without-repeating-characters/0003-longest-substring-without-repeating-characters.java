class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
     Map<Character,Integer> map = new HashMap<>();
        int l = 0, r = 0, maxlen = 0;
        
        while(r < n){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r))+1,l);
            }
            
            map.put(s.charAt(r), r);
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}