class Solution {
public:
    
    bool isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
           return true;
       else
           return false;
        
    }
    
    string reverseVowels(string s) {
        int n = s.size();
        int i=0,j=n-1;
        while(i<j){
            while(i<n && !isVowel(s[i])){
                i++;
            }
            
            while(j>=0 && !isVowel(s[j])){
                j--;
            }
            
            if(i<j){
                swap(s[i++],s[j--]);
            }
        }
        return s;
    }
};