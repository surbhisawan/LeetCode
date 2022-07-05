class Solution {
public:
    double myPow(double x, int n) {
        if(n==INT_MIN && x>1.0000)
            return 0.00000;
        if(n==INT_MIN && x==1.0000)
            return 1.00000;
        if(n==0)
            return 1.00000;
        else if(n<0)
            return 1/pow(x,abs(n));
        return pow(x,n);
    }
};