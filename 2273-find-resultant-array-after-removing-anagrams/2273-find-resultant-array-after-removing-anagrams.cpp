class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        vector<string> ans;
        ans.push_back(words[0]);
        string str = words[0];
        sort(str.begin(), str.end());
        
        for(int i=1;i<words.size();i++){
            string word = words[i];
            sort(word.begin(), word.end());
            if(word!=str){
                str = word;
                ans.push_back(words[i]);
            }
        }
        return ans;
    }
};