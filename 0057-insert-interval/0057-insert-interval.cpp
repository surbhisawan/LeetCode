class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        vector<vector<int>> vec;
        
        intervals.push_back(newInterval);
        intervals.push_back({INT_MAX, INT_MAX});
        
        sort(intervals.begin(), intervals.end());
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i = 1; i < intervals.size(); i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart > end){
                vec.push_back({start,end});
                start = currStart;
                end = currEnd;
            }else{
                end = max(end, currEnd);
            }
        }
        return vec;
    }
};