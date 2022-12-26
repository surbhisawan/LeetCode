class Solution {
public:
    bool canJump(vector<int>& nums) {
        
        int start = 0, end = nums.size()-1;
        int jump = nums[0];
        
        while(start <= jump and jump <= end){
            jump = max(jump, start + nums[start]);
            start++;
        }
        
        if(jump >= end)
            return true;
        
        return false;
    }
};