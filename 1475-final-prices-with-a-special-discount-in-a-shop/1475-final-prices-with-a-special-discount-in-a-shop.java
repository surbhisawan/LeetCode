class Solution {
    public int[] finalPrices(int[] prices) {
        int i = 0;
        
        int size = prices.length;
        
        Stack<Integer> stack = new Stack<>();
        
        while(i < size){
            
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i])
            {
                prices[stack.pop()] -= prices[i];
            }
            
            stack.add(i);
            i++;
        }
        return prices;
    }
}