class Solution {
public:
    bool isPerfectSquare(int n) {
        int s=1,e=n;
        while(s<=e){
            long long mid=s+(e-s)/2;
            if(mid*mid==n)
                return true;
            else if(mid*mid>n){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
};