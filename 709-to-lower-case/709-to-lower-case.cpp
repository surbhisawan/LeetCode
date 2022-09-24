class Solution {
public:
    
    string toLowerCase(string s) {
        int size = s.size();
        string str="";
        for(int i=0;i<size;i++){
            if(s[i]>='A' && s[i]<='Z'){
                char ch = tolower(s[i]);
                str+=ch;
            }else{
                str+=s[i];
            }
        }
        return str;
    }
};