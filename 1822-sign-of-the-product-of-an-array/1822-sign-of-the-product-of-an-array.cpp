class Solution {
public:
    
    int signFunc(vector<int> nums){
        int n=nums.size();
        int ncount=0;
        for(int i=0;i<n;i++){
            
            if(nums[i]==0)
                return 0;
            
            if(nums[i]<0){
                ncount++;
            }
        }
        
        if(ncount%2==0)
            return 1;
        else
            return -1;
        
    }
    
    int arraySign(vector<int>& nums) {
        
        if(signFunc(nums)>0)
            return 1;
        else if(signFunc(nums)<0)
            return -1;
        else
            return 0;
    }
};