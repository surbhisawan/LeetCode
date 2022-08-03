class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map <int,int> mp;
        for(int i=0;i<arr.size();i++){
            mp[arr[i]]++;
        }
        
        vector<int>ans;
        for(auto i:mp){
            ans.push_back(i.second);
        }
        
        set<int>st(ans.begin(),ans.end());
        int n=ans.size();
        int s=st.size();
        
        if(n==s) return true;
        return false;
    }
};