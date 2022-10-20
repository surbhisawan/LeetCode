class Solution {
public:
    
    void find(vector<int> nums, int index, vector<int> ans, vector<vector<int>>& result){
        if(index>=nums.size()){
            result.push_back(ans);
            return;
        }
        
        //exclude
        find(nums,index+1,ans,result);
        
        //include
        ans.push_back(nums[index]);
        find(nums,index+1,ans,result);
    }
    
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int>ans;
        find(nums,0,ans,result);
        return result;
    }
};