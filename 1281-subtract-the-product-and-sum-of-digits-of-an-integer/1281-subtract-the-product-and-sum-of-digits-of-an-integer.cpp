class Solution {
public:
    int subtractProductAndSum(int n) {
        int a=n,b=n;
        int sum=0,prod=1;
        while(a!=0)
        {
            sum+=a%10;
            a/=10;
        }
        while(b!=0){
            prod*=b%10;
            b/=10;
        }
        return (prod-sum);
    }
};