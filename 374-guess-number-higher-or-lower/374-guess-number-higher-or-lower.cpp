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
    int guessNumber(int n) {
        int first=1,last=n;
        while(first<=last){
            int mid=first+(last-first)/2;
            int result = guess(mid);
            if(result==0)
                return mid;
            else if(result<0)
                last=mid-1;
            else 
                first=mid+1;
        }
        return -1;
    }
};