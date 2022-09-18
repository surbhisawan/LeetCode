class Solution {
public:
    bool isValid(string s) {
        int n=s.size();
        unordered_map<char,char>map;
        map['(']=')';
        map['[']=']';
        map['{']='}';
        string st;
        st.push_back(s[0]);
        for(int i=1;i<n;i++){
            if(map[st.back()]==s[i])
                st.pop_back();
            else
                st.push_back(s[i]);
        }
        return st.size()? 0:1;
    }
};