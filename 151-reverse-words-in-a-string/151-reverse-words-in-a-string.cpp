class Solution {
public:
    string reverseWords(string s) {
        int n=s.size();
        if(n == 0) return s;
        stack<string> stack;
        string result;
        for(int i=0;i<n;i++){
            string word;
            if(s[i]==' ') 
                continue;
            
            while(i<n && s[i]!=' '){
                word+=s[i];
                i++;
            }
            
            stack.push(word);
        }
        
        while(!stack.empty()){
            result+=stack.top();
            stack.pop();
            if(!stack.empty()) 
                result+=" ";
        }
        return result;
    }
};