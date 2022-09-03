class Solution {
public:
    vector<int> numsSameConsecDiff(int n, int k) {
        vector<int> vec = {1,2,3,4,5,6,7,8,9};
        for(int i=2;i<=n;i++){
            vector<int>result;
            for(auto i:vec){
                int y = i%10;
                if(y+k<10)
                    result.push_back(i*10+y+k);
                if(k>0 && y-k>=0)
                    result.push_back(i*10+y-k);
            }
            vec = result;
        }
        return vec;
    }
};