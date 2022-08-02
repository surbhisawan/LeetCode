class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> vec;
        for(int i=0;i<=n;i++){
            int count=0;
            int num=i;
            while(num!=0){
                if(num%2)count++;
                num/=2;
            }
            vec.push_back(count);
        }
        return vec;
    }
};