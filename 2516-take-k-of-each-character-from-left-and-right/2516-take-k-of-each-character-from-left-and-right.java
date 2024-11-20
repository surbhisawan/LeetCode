class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] freq = new int[3];
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        
        for(int i = 0; i < 3; i++){
            if(freq[i] < k){
                return -1;
            }
        }
        
        int l = 0, r = 0, res = Integer.MAX_VALUE;
        while(r < n) {
            freq[s.charAt(r) - 'a']--;
            r++;
            while (Math.min(Math.min(freq[0], freq[1]), freq[2]) < k) {
                freq[s.charAt(l) - 'a']++;
                l++;
            }
            res = Math.min(res, n - (r - l));
        }
        return res;
    }
}