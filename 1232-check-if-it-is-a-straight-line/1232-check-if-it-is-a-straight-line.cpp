class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coord) {
        int n=coord.size();
        if(n==1)
            return false;
        if(n==2)
            return true;
        
        int x0 = coord[0][0], y0=coord[0][1];
        int dx = coord[1][0]-x0, dy=coord[1][1]-y0;
        
        for(int i=2;i<n;i++){
            int x=coord[i][0],y=coord[i][1];
            if(dx*(y-y0)!=dy*(x-x0))
                return false;
        }
        return true;
    }
};