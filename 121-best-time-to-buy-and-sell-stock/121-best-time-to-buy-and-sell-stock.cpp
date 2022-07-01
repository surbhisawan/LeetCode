class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int tp=0,profit=0;//total profit
        int n=prices.size();
        int minNo = INT_MAX;
        for(int i=0;i<n;i++){
            if(minNo>prices[i])
                minNo=prices[i];
            profit=prices[i]-minNo;
            if(tp<profit)
                tp=profit;
        }
    return tp;
    }
};