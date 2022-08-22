class Solution {
public:
    long long climbStairs(long long n) {
       if(n<=0)
           return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        
        int ans=0;
        int onestep=1;
        int twostep=2;
        for(int i=3;i<=n;i++){
            ans=twostep+onestep;
            onestep=twostep;
            twostep=ans;
        }
        return ans;
    }
};