class Solution {
public:
    
    bool check(int count1[], int count2[]){
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i])
                return 0;
        }
        return 1;
    }
    
    
    bool checkInclusion(string s1, string s2) {
        int count1[26]={0};
        for(int i=0;i<s1.length();i++){
            int index=s1[i]-'a';
            count1[index]++;
        }
        
        int winSize=s1.length();
        int i=0;
        int count2[26]={0};
        while(i<winSize && i<s2.length()){
            count2[s2[i]-'a']++;
            i++;
        }
        
        if(check(count1,count2))
            return 1;
        
        while(i<s2.length()){
            char newChar = s2[i];
            count2[s2[i]-'a']++;
            count2[s2[i-winSize]-'a']--;
            i++;
            
            if(check(count1,count2))
               return 1;
            
        }
        
        return 0;
    }
};