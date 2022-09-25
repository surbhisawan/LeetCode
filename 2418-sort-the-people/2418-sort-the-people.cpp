class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<pair<int,string>>vec;
        for(int i=0;i<names.size();i++){
            vec.push_back({heights[i],names[i]});
        }
        
        sort(vec.begin(), vec.end(), greater<>());
        vector<string> result;
        for(auto [i,j]:vec){
            result.push_back(j);
        }
        return result;
    }
};