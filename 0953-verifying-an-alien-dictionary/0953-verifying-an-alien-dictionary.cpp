class Solution {
public:
    
    bool check(string &a, string &b, string order){
        int ptr = 0;
        while(ptr < a.size() and a[ptr] == b[ptr])
            ptr++;
        
        if(a.size() == ptr)
            return true;
        else if(b.size() == ptr)
            return false;
        
        return (order.find(a[ptr]) < order.find(b[ptr]));
    }
    
    bool isAlienSorted(vector<string>& words, string order) {
        for(int i = 0; i < words.size()-1; i++){
            if(!check(words[i], words[i+1], order)){
                return false;
            }
        }
        return true;
    }
};