class Solution {
public:
    string freqAlphabets(string s) {
        unordered_map<string, char> mp;
        for(int i=1;i<10;i++){
            string ch=to_string(i);
            mp[ch]='a'+i-1;
        }
        
        for(int i=10;i<=26;i++){
            string ch=to_string(i)+'#';
            mp[ch]='a'+i-1;
        }
        
        string str="";
        for(int i=s.size()-1;i>=0;i--){
            if(s[i]=='#'){
                str+=mp[s.substr(i-2,3)];
                i-=2;
            }
            else{
                string ss = "a";
                ss[0]=s[i];
                str+=mp[ss];
            }
        }
        reverse(str.begin(),str.end());
        return str;
    }
};