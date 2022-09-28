class Solution {
public:
    
    int gcd(int a, int b){
        if(a==b)
            return a;
        
        if(a==0)
            return b;
        
        if(b==0)
            return a;
        
        if(a>b)
           return gcd(a-b,b);
        
         return gcd(a,b-a);
        
    }
    
    int findGCD(vector<int>& nums) {
        int min = *min_element(nums.begin(),nums.end());
        int max = *max_element(nums.begin(),nums.end());
        
        return gcd(min,max);
    }
};