class Solution {
public:
    int mySqrt(int x) {
     int s=0,e=x;
     long long int res=-1;
     long long int mid=s+(e-s)/2;
        while(s<=e){
            unsigned long int ans=mid*mid;
            if(ans==x){
                return mid;
            }
            else if(ans<x){
                res=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return res;
    }
};