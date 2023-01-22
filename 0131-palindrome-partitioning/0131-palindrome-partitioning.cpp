class Solution {
public:
    
    void solve(vector<vector<string>> &ans, vector<string> &pal, string s, int idx){
        if(s.size() == idx){
            ans.push_back(pal);
            return;
        }
        
        
        for(int i = idx; i<s.size(); i++){
            if(check(s,idx,i)){
                pal.push_back(s.substr(idx, i-idx+1));
                solve(ans, pal, s, i+1);
                pal.pop_back();
            }
        }
    }
    
    bool check(string s, int start, int last){
        while(start <= last ){
            if(s[start++] != s[last--])
                return false;
        }
        return true;
    }
    
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> pal;
        solve(ans, pal, s, 0);
        return ans;
    }
};