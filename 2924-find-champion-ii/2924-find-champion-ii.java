class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indeg = new int[n];
        
        for(int[] edge : edges){
            indeg[edge[1]]++;
        }
        
        int cnt = 0;
        int champion = -1;
        for(int i = 0; i < n; i++){
            if(indeg[i] == 0){
                champion = i;
                cnt++;
            }
        }
        
        return cnt > 1 ? -1 : champion;
    }
}