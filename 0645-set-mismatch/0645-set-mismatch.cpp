class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        map<int,int>mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        
        int dup=-1;
        int missing=-1;
        
        for(int i=1;i<=nums.size();i++){
            if(mp[i]==0){
                missing=i;
            }
            if(mp[i]==2){
                dup=i;
            }
        }
        
        return {dup,missing};
    }
};