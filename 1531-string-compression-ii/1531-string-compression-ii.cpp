class Solution {
public:
    
    int dp[101][101];
    
    int find(string s, int ptr, int K){
        int k=K;
        if(s.size()-ptr<=K)
            return 0;
        if(dp[ptr][k]>=0)
            return dp[ptr][k];
        
        int res = K? find(s,ptr+1,K-1):10001,c=1;
        
        for(int i=ptr+1;i<=s.size();i++){
            res = min(res,find(s,i,k) + 1 + (c>=100?3:(c>=10?2:(c>1?1:0))));
            if(i==s.size())
                break;
            if(s[i]==s[ptr])
                c++;
            else if(--k<0)
                break;
        }
        return dp[ptr][K]=res;
    }
    
    
    int getLengthOfOptimalCompression(string s, int k) {
        memset(dp,-1,sizeof(dp));
        return find(s,0,k);
    }
};