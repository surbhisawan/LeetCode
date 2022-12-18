class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temp) {
        int n = temp.size();
        stack<pair<int,int>> stack;  //contain the record of value and index
        vector<int> ans(n,0);
        for(int i=n-1; i>=0; i--){
            while(stack.size()>0 and stack.top().first <= temp[i]){
                stack.pop();
            }
            if(stack.size()!=0)
                ans[i] = stack.top().second-i;
            
            stack.push({temp[i],i});
        }
        return ans;
    }
};