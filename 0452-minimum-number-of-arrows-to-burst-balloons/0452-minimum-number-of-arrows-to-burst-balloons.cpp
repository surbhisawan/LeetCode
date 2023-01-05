bool comp(vector<int>& a, vector<int>& b){
        return a[1]<b[1];
    }

class Solution {
public:
    
    int findMinArrowShots(vector<vector<int>>& x) {
        sort(x.begin(), x.end(), comp);
        
        if(x.size() == 1)
            return 1;
        
        int count = 1;
        int end = x[0][1];
        for(int i = 1; i < x.size(); i++){
            if(x[i][0] > end){
              count++;
              end = x[i][1];  
            }
        }
        
        return count;
    }
};