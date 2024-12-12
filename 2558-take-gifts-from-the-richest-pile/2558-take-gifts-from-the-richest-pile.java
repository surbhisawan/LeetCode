class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int it : gifts){
            pq.add(it);
        }
        
        while(k > 0){
            
            int element = pq.poll();
            
            int reduceValue = (int) Math.floor(Math.sqrt(element));
            
            pq.add(reduceValue);
            k--;
        }
        
        long sum = 0;
        
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}