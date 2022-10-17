class Solution {
public:
    bool checkIfPangram(string s) {
       set<int> st;
        for(auto i:s){
            st.insert(i);
        }
        return st.size()==26;
    }
};