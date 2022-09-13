class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int>map;
        int n = nums.size();
        for(int i=0;i<n;i++){
            map[nums[i]]++;
        }
        
        for(auto [i,j]:map){
            if(j>1){
                return true;
            }
        }
        return false;
    }
};