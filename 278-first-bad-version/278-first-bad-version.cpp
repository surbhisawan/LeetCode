// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
       int start=1,last=n;
        while(start<=last){
            int  mid=start+(last-start)/2;
            if(isBadVersion(mid)){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
};