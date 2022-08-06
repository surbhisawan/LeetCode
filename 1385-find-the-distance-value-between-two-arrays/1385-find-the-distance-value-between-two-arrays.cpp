class Solution {
public:
    bool possible(vector<int>& arr, int d, int key){
        int s=0,e=arr.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(abs(arr[mid]-key)<=d)
                return false;
            else if(arr[mid]<key)
                s=mid+1;
            else
                e=mid-1;
        }
        return true;
    }
    
    
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        sort(arr2.begin(),arr2.end());
        int c=0;
        for(auto i:arr1){
            if(possible(arr2,d,i)) c++;
        }
        return c;
    }
};