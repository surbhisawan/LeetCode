public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            int r = n&1;
            n>>>=1;
            if(r==1) c++;
        }
        return c;
    }
}