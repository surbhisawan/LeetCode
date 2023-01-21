class Solution {
public:
    
    void solve(vector<string> &temp, vector<string> &ip, string &s, int idx){
       if(idx == s.size() and temp.size()==4){
           string result = temp[0]+'.'+temp[1]+'.'+temp[2]+'.'+temp[3];
           ip.push_back(result);
           return;
       }
            
       string str="";
       for(int i = idx; i<s.size() and  temp.size()<4; i++){
           if(s[i]-'0'>9)
               continue;
           str+=s[i];
           int val = stoi(str);
           if(val>=0 and val<=255){
               temp.push_back(str);
               solve(temp, ip, s, i+1);
               temp.pop_back();
           }
           
           if(val<=0 or val>255)
               break;
           
       }     
    }
    
    vector<string> restoreIpAddresses(string s) {
        vector<string> temp;
        vector<string> ip;
        solve(temp, ip, s, 0);
        return ip;
    }
};