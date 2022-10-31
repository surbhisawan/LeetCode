class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int total_time=0,maxTime=0;
        for(int i=0;i<colors.size();i++){
            if(i>0 and colors[i]!=colors[i-1]){
                maxTime=0;
            }
            
            total_time+=min(neededTime[i],maxTime);
            maxTime=max(maxTime,neededTime[i]);
        }
        return total_time;
    }
}; 