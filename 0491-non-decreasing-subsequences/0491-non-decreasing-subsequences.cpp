class Solution {
public:
    
    void solve(vector<vector<int>> &ans, vector<int> &store, vector<int> &nums, int idx){
        if(store.size() > 1)
            ans.push_back(store);
        
        set<int> st;
        for(int i=idx;i<nums.size();i++){
            if((store.empty() or nums[i] >= store.back()) and st.find(nums[i]) == st.end()){
                store.push_back(nums[i]);
                solve(ans, store, nums, i+1);
                store.pop_back();
                st.insert(nums[i]);
            }
        }
    }
    
    vector<vector<int>> findSubsequences(vector<int>& nums) {
      vector<vector<int>> ans;
      vector<int> store;  
      solve(ans, store, nums,0);
      return ans;  
    }
};