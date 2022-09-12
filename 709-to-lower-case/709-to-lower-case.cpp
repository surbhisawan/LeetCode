class Solution {
public:
    
    string toLowerCase(string s) {
        int n = s.size();
        string str="";
        for(int i=0;i<n;i++){
            char ch=s[i];
            if(ch>='a' && ch<='z'){
                str+=ch;
            }else if(ch>='A' && ch<='Z'){
                str+=ch+32;
            }
            else{
                str+=ch;
            }
        }
        return str;
    }
};