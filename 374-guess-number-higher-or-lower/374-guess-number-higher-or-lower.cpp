/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    
    int search(int n, int s, int e){
        if(s>e)
            return -1;
        
        int mid = s+(e-s)/2;
        if(guess(mid)==0)
            return mid;
        else if(guess(mid)>0)
            return search(n, mid+1,e);
        else
            return search(n,s,mid-1);
    }
    
    int guessNumber(int n) {
        int start=1,end=n;
        int ans=search(n,start,end);
        return ans;
    }
};