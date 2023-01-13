class Solution {
public:
    vector<int>tree[100005];
    int ans;
        int FindLongestLength(int curr_node,string&s){
            int best=0,second_best=0;
            for(auto child_node:tree[curr_node]){
                int len=FindLongestLength(child_node,s);
                if(s[child_node]==s[curr_node])
                    continue;
                if(len>best){
                    second_best=best;
                    best=len;
                 }
                else if(len>second_best) {
                    second_best=len;
                  }
        } 
        int case1=1+best;
        int case2=1+best+second_best;
        ans=max({ans,case1,case2});
        return case1;
    }
    int longestPath(vector<int>& parent, string s) {
        for(int i=1;i<parent.size();i++)
            tree[parent[i]].push_back(i);
        
        ans=0;
        FindLongestLength(0,s);
        return ans;
        
    }
};