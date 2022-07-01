// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int first=1,last=n;
        int mid;
        while(first<=last){
            mid=first+(last-first)/2;
            if(!isBadVersion(mid))
                first=mid+1;
            else 
                last=mid-1;
        }
        return last+1;
    }
};