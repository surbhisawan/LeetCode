class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        unordered_set<int> s;
        int n=nums.size();
        for(auto i:nums)
            s.insert(i);
        vector<int> vec;
        
        
        for(int i=1;i<=n;i++){
            if(s.find(i)==s.end())
                vec.emplace_back(i);
        }
        return vec;
    }
};