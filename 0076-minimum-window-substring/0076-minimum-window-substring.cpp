class Solution {
public:
    string minWindow(string s, string t) {
        unordered_map<char,int>mp;
        for(auto c : t) 
            mp[c]++; 
        int count = 0;
        int low = 0, length = INT_MAX, start = 0;     
        for(int high = 0; high<s.length(); high++) {
            if(mp[s[high]] > 0) 
                count++;   
            mp[s[high]]--; 
            if(count == t.length()) {
                while(low < high && mp[s[low]] < 0)
                    mp[s[low]]++, low++; 
                if(length > high-low) 
                    length = high-(start=low)+1;
                mp[s[low++]]++; 
                count--; 
            }
        }
        return length == INT_MAX ? "" : s.substr(start,length);
    }
};