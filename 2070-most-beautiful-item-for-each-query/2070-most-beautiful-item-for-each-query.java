class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length; 
        int[] ans = new int[n];
        
        int[][] map = new int[n][2];
        Arrays.sort(items, (a,b) -> a[0]-b[0]);
        
        for(int i = 0; i < n; i++){
            map[i][0] = queries[i];
            map[i][1] = i;
        }
    
        Arrays.sort(map, (a,b)->a[0]-b[0]);
        
        int idx = 0, max = 0;
        for(int i = 0; i < n; i++){
            int q = map[i][0];
            int index = map[i][1];
            while(idx < items.length && items[idx][0] <= q){
                max = Math.max(max,items[idx][1]);
                idx++;
            }
            ans[index] = max;
        }
        return ans;
    }
}