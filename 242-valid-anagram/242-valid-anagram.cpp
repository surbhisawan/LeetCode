class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int>map;
        int n1 = s.size();
        int n2 = t.size();
        if(n1!=n2){
            return false;
        }
        
        for(auto i:s){
            map[i]++;
        }
        
        for(auto i:t){
         map[i]--;
            if(map[i]<0)
                return false;
        }
        return true;
    }
};