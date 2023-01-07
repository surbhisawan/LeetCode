class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int start = 0, curGas = 0, rGas = 0;
        for(int i = 0; i < gas.size(); i++){
            curGas = curGas + gas[i] - cost[i];
            if(curGas < 0){
                start = i + 1;
                rGas += curGas;
                curGas = 0;
            }
        }
        
        if(rGas+curGas >= 0)
            return start;
        
        return -1;
    }
};