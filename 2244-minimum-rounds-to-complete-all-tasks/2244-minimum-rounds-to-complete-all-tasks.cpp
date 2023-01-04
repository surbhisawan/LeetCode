class Solution {
public:
    int minimumRounds(vector<int>& tasks) {
        map<int,int> mp;
        for(auto i : tasks){
            mp[i]++;
        }
        
        int minAns = 0;
        for(auto [task, count] : mp){
            if(count == 1)
                return -1;
            else if(count%3 == 0){
                minAns += count/3; 
            }else{
                minAns += count/3 + 1;
            }
        }
        return minAns;
    }
};