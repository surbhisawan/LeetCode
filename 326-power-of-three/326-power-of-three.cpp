class Solution {
public:
    
    bool check(int n, int start, int end){
        if(start>end){
            return false;
        }
        
        int mid = start+(end-start)/2;
        if(pow(3,mid)==n)
            return true;
        else if(pow(3,mid)>n)
            return check(n,start,mid-1);
        else
            return check(n,mid+1,end);
    }
    
    bool isPowerOfThree(int n) {
        int start=0,end=n;
        bool ans = check(n,start,end);
        return ans;
    }
};