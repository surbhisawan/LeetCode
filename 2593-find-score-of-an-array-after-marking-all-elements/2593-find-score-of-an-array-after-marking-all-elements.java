class Solution {
    public long findScore(int[] nums) {
        long score = 0;
        boolean[] vis = new boolean[nums.length];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
        {
           if(a[0]!=b[0]){ return a[0]-b[0];}

           return a[1]-b[1];
    });

        for(int it = 0; it < nums.length; it++){
            pq.add(new int[]{nums[it],it});
        }

        while(!pq.isEmpty()){
            int[] element = pq.peek();

            int value = element[0];
            int idx = element[1];

            if(!vis[idx]){
                vis[idx] = true;

                if(idx-1 >=0){
                   vis[idx-1] = true;
                }
                
                if(idx+1 < nums.length){
                    vis[idx+1] = true;
                }

                score += value;
            }

            pq.poll();

        }

        return score;
    }
}