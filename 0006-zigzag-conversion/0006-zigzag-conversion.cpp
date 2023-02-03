class Solution {
public:
    string convert(string s, int numRows) {
        int n = s.size();
        
        if(numRows==1) return s;
        int jump = 2*(numRows-1);
        string ans = "";
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < n; j+=jump){
                ans += s[j];
                int mid = j + jump - 2*i;
                if(i > 0 and i < numRows-1 and mid < n){
                    ans += s[mid]; 
                }
            }
        }
        return ans;
    }
};