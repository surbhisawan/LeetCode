class Solution {
public:
    int nearestValidPoint(int x, int y, vector<vector<int>>& points) {
        int n=points.size();
        int position=-1;
        int ans=INT_MAX;
        for(int i=0;i<n;i++){
            if(points[i][0]==x || points[i][1]==y){
                int distance = abs(x-points[i][0])+abs(y-points[i][1]);
                if(distance<ans){
                    position=i;
                    ans=distance;
                }
            }
        }
        
        return position;
    }
};