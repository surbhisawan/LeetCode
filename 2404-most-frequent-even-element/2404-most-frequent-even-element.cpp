class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        map<int,int> map;
        for(int i=0;i<nums.size();i++){
            if(nums[i]%2==0)
                map[nums[i]]++;
        }
        int ans=-1,maxNo = 0;
        for(auto [i,j]:map){
            if(j>maxNo){
                maxNo = j;
                ans = i;
            }
        }
        
        return ans;
    }
};