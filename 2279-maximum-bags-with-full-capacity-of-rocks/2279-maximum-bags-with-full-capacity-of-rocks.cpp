class Solution {
public:
    int maximumBags(vector<int>& capacity, vector<int>& rocks, int add) {
        int n = capacity.size();
        
        int count = 0;
        vector<int> diff;
        for(int ptr=0; ptr<n; ptr++){
            diff.push_back(capacity[ptr] - rocks[ptr]);
        }
        
        sort(diff.begin(), diff.end());
        int i = 0;
        while(n){
            if(add >= diff[i] and diff[i]!=0){
                add -= diff[i];
                count++;
            }else if(diff[i] == 0){
                count++;
            }
            n--;
            i++;
        }
        return count;
    }
};