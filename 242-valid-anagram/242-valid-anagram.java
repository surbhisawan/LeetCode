
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n1 =s.length();
        int n2 =t.length();
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        if(n1!=n2)
            return false;
        
        for(int i=0;i<n1;i++){
            count1[s.charAt(i)-'a']++;
        }
        
        for(int j=0;j<n2;j++){
            count2[t.charAt(j)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i])
               return false; 
        }
        return true;
    }
}