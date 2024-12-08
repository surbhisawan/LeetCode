class Solution {
    public int maxTwoEvents(int[][] events) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
            Comparator.comparingInt(Pair::getKey)
        );
        
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        
        int maxSum = 0, maxVal = 0;
        for(int i = 0; i < events.length; i++){
            
            while(!pq.isEmpty() && pq.peek().getKey() < events[i][0]){
                maxVal = Math.max(maxVal,pq.peek().getValue());
                pq.poll();
            }
            
            maxSum = Math.max(maxSum,maxVal + events[i][2]);
            pq.add(new Pair<>(events[i][1],events[i][2]));
        }
        return maxSum;
    }
}