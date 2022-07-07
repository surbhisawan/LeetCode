class Solution {
public:
    int countEven(int num) {
            int r=0,sum=0;
            int n=num;
            while(n!=0)
            {
            r=n%10;
            sum+=r;
            n/=10;    
            }
        return sum%2==0? num/2:(num-1)/2;
    }
};