class Solution {
public:
    
    bool canConstruct(string ransomNote, string magazine) {
        int n=ransomNote.size();
        int m=magazine.size();
        
        if(n>m)
            return false;
        
        unordered_map<char,int>map1,map2;
        for(int i:ransomNote)
            map1[i]++;
        for(int i:magazine)
            map2[i]++;
        
        for(auto [i,j]:map1){
            if(map2[i]<j)
                return false;
        }
        return true;
    }
};