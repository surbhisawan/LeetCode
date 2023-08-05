class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while(n>9){
            int sum = 0,r=0;
            while(temp!=0){
                r = temp%10;
                sum+=r*r;
                temp/=10;
            }
            n = sum;
            temp = n;
        }  
        if(n==1  || n==7){
             return true;   
            }
        return false;
    }
}