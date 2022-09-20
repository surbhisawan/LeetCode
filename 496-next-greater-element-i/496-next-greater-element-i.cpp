class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int n1=nums1.size();
        int n2=nums2.size();
        
        vector<int> result;
        int ans=-1;
        for(int i=0;i<n1;i++){
            ans=-1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<n2;k++){
                        if(nums2[j]<nums2[k]){
                            ans=nums2[k];
                            break;
                        }
                    }
                }
            }
            result.push_back(ans);
        }
        
        return result;
    }
};