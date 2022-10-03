class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit=0,maxProfit=0;
        int n=prices.size();
        int minNo=INT_MAX;
        for(int i=0;i<n;i++){
            if(minNo>prices[i])
                minNo=prices[i];
            profit=prices[i]-minNo;
            if(profit>maxProfit)
                maxProfit=profit;
        }
        return maxProfit;
    }
};