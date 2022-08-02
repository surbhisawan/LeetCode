class Solution {
public:
    int findComplement(int num) {
        int m=num;
        int mask=0;
        if(num==1) return 0;
        if(num==0) return 1;
        while(m!=0){
            mask=(mask<<1)|1;
            m>>=1;
        }
        int ans =~num&mask;
        return ans;
    }
};