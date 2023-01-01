class Solution {
public:
    bool wordPattern(string p, string s) {
        map<char, int> mp;
        map<string, int> ms;
        int i=0, n=p.size();
        istringstream in(s);
        for(string word; in>>word;i++){
            if(i==n or mp[p[i]]!=ms[word])
                return false;
            mp[p[i]] = ms[word] = i+1;
        }
        return i==n;
    }
};