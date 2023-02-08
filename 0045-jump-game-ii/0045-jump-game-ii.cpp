class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        if(n < 2)
            return 0;
        
        int i=0;
        int jump = 1, currjump = nums[0], maxjump = nums[0];
        while(i < n-1){
            maxjump = max(maxjump, i+nums[i]);
            if(currjump == i){
                jump++;
                currjump = maxjump;
            }
            i++;
        }
        return jump;
    }
};