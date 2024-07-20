class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        for(int i : nums){
            pq.add(i);
        }
        
        int frq = k-1;
        
        while(frq > 0){
            pq.poll();
            frq--;
        }
        
        return pq.peek();
    }
}