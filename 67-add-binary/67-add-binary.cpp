class Solution {
public:
    string addBinary(string a, string b) {
        int n1 = a.size()-1;
        int n2 = b.size()-1;
        int carry = 0 ;
        int sum = 0;
        string str="";
        while(n1>=0 || n2>=0 || carry>0){
            sum=carry;
            
            if(n1>=0) sum+=a[n1--]-'0';
            
            if(n2>=0) sum+=b[n2--]-'0';
            
            carry = sum>1?1:0;
            
            str+=to_string(sum%2);
        }
        
        if(carry!=0){
            str+=to_string(carry);
        }
        
        reverse(str.begin(),str.end());
        
        return str;
    }
};