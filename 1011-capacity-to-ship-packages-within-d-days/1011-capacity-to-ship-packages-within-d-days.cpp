class Solution {
public:
    bool possible(vector<int>arr, int n, int k, int mid){
    int days=1;
    int psum=0;
    for(int i=0;i<n;i++){
        if(psum+arr[i]<=mid){
            psum+=arr[i];
        }
        else{
            days++;
            if(days>k || arr[i]>mid) return false;
            psum=arr[i];
        }
    }
    return true;
}
    
    
    int shipWithinDays(vector<int>& arr, int days) {
        int s=0,ans=-1;
        int n=arr.size();
        int sum=accumulate(begin(arr), end(arr),0);
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
        if(possible(arr,n,days,mid)){
            ans=mid;
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        }
        return ans;
    }
};