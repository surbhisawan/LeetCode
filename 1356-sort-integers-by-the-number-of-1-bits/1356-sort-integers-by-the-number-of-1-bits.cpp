class Solution {
public:
    static int bits(int a){
        int count = 0;
        while(a){
            a = a&(a-1);
            count++;
        }
        return count;
    }
    
    
    static bool compare(int a, int b){
        int p = bits(a);
        int q = bits(b);
        if(p==q){
            return (a<=b);
        }
        else{
            return (p<q);
        }
    }
    
    vector<int> sortByBits(vector<int>& arr) {
        sort(arr.begin(),arr.end(),compare);
        return arr;
    }

    
    
};