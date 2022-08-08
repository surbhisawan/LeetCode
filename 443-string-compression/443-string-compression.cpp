class Solution {
public:
    int compress(vector<char>& chars) {
        int i=0;
        int n=chars.size();
        for(int j=1,count=1;j<=n;j++,count++)
        {
            if(j==n || chars[j]!=chars[j-1]){
                chars[i++]=chars[j-1];
                if(count>1)
                    for(char ch:to_string(count))
                        chars[i++]=ch;
                count=0;    
            }
        }
        return i;
    }
};