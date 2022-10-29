class Solution {
public:
    int earliestFullBloom(vector<int>& plantTime, vector<int>& growTime) {
        vector<pair<int,int>>vec;
        for(int i=0;i<plantTime.size();i++){
            vec.push_back({growTime[i],plantTime[i]});
        }
        
        int total_time=INT_MIN;
        int sum=0;
        
        sort(vec.begin(),vec.end());
        for(auto i:vec){
            int gt = i.first;
            int pt = i.second;
            total_time=max(total_time,gt)+pt;
        }
        return total_time;
    }
};