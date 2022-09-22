class Solution {
public:
    string reverseWords(string s) {
        int n =s.size();
        int index=-1;
        string result="";
        for(int i=0;i<n;i++){
            if(s[i]==' ' || i==n-1){
                
                int j = (i==n-1)?i:i-1;
                for(;j>index;j--){
                    result+=s[j];
                }
                
                if(i!=n-1){
                    result+=" ";
                }
                
                index=i;
            }
        }
        
        return result;
    }
};