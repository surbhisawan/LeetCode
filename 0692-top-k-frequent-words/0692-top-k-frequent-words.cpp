class Solution {
public:
    
    static bool compare(pair<int,string>&a, pair<int,string>&b){
        if(a.first==b.first)
            return a.second<b.second;
        return a.first>b.first;
        
    }
    
    vector<string> topKFrequent(vector<string>& words, int k) {
        vector<string> ans;  //to store the result
        
        map<string,int>mp;
        for(int i=0;i<words.size();i++){
            mp[words[i]]++;
        }
        
        vector<pair<int,string>>vec;
        for(auto &i:mp){
            vec.push_back({i.second,i.first});
        }
        
        sort(vec.begin(), vec.end(),compare);
        
        for(auto &i:vec){
            if(k){
                ans.push_back(i.second);
                k--;
            }else{
                break;
            }
        }
        return ans;
    }
};