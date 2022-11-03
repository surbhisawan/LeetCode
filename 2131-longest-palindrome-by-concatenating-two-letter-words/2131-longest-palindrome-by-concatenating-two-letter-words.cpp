class Solution {
public:
    int longestPalindrome(vector<string>& words) {
        
         unordered_map<string,int> mp;
        
        for(auto i:words){
            mp[i]++;
        }
        
        int ans=0;
        bool central=false;
        
        for(auto i:words){
            string wd=i;
            reverse(wd.begin(),wd.end());
            
            if(wd!=i and mp[wd]>0 and mp[i]>0)
            {
                mp[wd]--;
                mp[i]--;
                ans+=4;
            }else if(wd==i and mp[i]>1)
            {
                mp[i]-=2;
                ans+=4;
            }else if(wd==i and !central and mp[i]>0)
            {
                mp[i]--;
                ans+=2;
                central=true;
            }
        }
        return ans;
        
    }
};