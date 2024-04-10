class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();    
        
        for(int i = 0; i < n ; i++){
            q.add(i);
        }
        
        Arrays.sort(deck);
        
        int[] result = new int[n];
        
        for(int i = 0 ; i < n; i++){
            
            result[q.poll()] = deck[i];
            
            q.add(q.poll());
            
        }
        
        return result;
    }
}