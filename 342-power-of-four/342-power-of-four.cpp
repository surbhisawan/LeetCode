class Solution {
public:
    
    bool search(int n, int s, int e){
        if(s>e)
            return false;
        
        if(n==0)
            return false;
        
        int mid = s+(e-s)/2;
        if(pow(4,mid)==n)
            return true;
        else if(pow(4,mid)>n)
            return search(n,s,mid-1);
        else
            return search(n,mid+1,e);
    }
    
    
    
    bool isPowerOfFour(int n) {
      int start=0,end=n;
      int ans = search(n,start,end);
      return ans;
    }
};