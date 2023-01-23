class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        int size = trust.size();
        
        vector<int> ans(n+1,0);
        for(int i=0;i<size;i++){
            ans[trust[i][0]]--;
            ans[trust[i][1]]++;
        }
        
        for(int i=1;i<ans.size();i++){
            if(ans[i]==n-1)
                return i;
        }
        return -1;
    }
};