class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        for(int i=0;i<nums2.size();i++){
            nums1.push_back(nums2[i]);
        }
        
        sort(nums1.begin(),nums1.end());
        double k1 = nums1[nums1.size()/2];
        double k2 = nums1[(nums1.size()-1)/2];
        
        double k;
        if(nums1.size()%2==0){
            k=k1+(k2-k1)/2;
        }else{
            k=k1;
        }
        
        return k;
    }
};