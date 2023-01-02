class Solution {
public:
    bool detectCapitalUse(string word) {
        int n = word.size();  
        int count = 0; 
        for(auto i : word){
           if(isupper(i)){
               count++;
           }
        }
        
        if(count == 1 and isupper(word[0]))
            return true;
        
        return count == n or count == 0;
    }
};