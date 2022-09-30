class Solution {
public:
    int strStr(string haystack, string needle) {
        if(haystack==needle)
            return 0;
        string str;
        int len = haystack.size()-needle.size();
        for(int i=0;i<=len;i++){
            str=haystack.substr(i,needle.size());
            if(str==needle)
                return i;
        }
        return -1;
    }
};