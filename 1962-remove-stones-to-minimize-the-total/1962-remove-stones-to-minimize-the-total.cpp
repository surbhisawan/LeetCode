class Solution {
public:
    int minStoneSum(vector<int>& piles, int k) {
        priority_queue<int> queue;
        
        for(auto i:piles){
            queue.push(i);
        }
        
        int sum = 0;
        while(k){
            int x = (queue.top()%2==0 ? queue.top()/2 : queue.top()/2+1);
            queue.pop();
            queue.push(x);
            k--;
        }
        
        while(!queue.empty()){
            sum += queue.top();
            queue.pop();
        }
        return sum;
    }
};