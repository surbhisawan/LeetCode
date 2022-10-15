class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> res;
        sort(potions.begin(),potions.end());
        for(int i=0;i<spells.size();i++){
            long long start=0,end=potions.size()-1,mid=0;
            int ans=-1;
            while(start<=end){
                mid=start+(end-start)/2;
                if((long long)spells[i]*potions[mid]>=success){
                    end=mid-1;                    
                }else{
                    start=mid+1;
                    ans=mid;
                }
            }
            res.push_back(potions.size()-ans-1);
        }
        return res;
    }
};