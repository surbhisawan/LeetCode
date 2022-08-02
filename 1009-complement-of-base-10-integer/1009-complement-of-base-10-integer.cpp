class Solution {
public:
    int bitwiseComplement(int n) {
        int a=n;
        int mask=0;
        if(n==0) return 1;
        while(a!=0){
            mask<<=1;
            mask|=1;
            a>>=1;
        }
        int ans= mask&(~n);
        return ans;
    }
};