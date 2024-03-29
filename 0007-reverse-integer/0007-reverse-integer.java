class Solution {
    public int reverse(int x) {
        long ans = 0L;
        
        while(x!=0){
            ans = ans*10 + x%10;
            x/=10;
        }
        
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        
        return (int)ans;
    }
}