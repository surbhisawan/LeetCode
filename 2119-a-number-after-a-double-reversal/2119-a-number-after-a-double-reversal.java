class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1 = num;
        
        
        int reversed1 = 0;
        while(temp1!=0){
            reversed1 = reversed1*10 + temp1%10;
            temp1/=10;
        }
        
        int reversed2 = 0;
        while(reversed1!=0){
            reversed2 = reversed2*10 + reversed1%10;
            reversed1/=10;
        }
        
        if(reversed2 == num)
            return true;
        else
            return false;
        
    }
}