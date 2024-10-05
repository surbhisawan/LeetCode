class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < numCourses; i++){
            ans.add(new ArrayList<>());
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            ans.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int[] deg = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            for(int it : ans.get(i)){
                deg[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < numCourses; i++){
            if(deg[i] == 0){
                q.add(i);
            }
        }
        
        int[] top = new int[numCourses];
        int k = 0;
        
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            
            top[k++] = node;
            
            for(int it : ans.get(node)){
                deg[it]--;
                
                if(deg[it] == 0){
                    q.add(it);
                }
            }
        }
        
        if(k == numCourses){
            return top;
        }
        
       
        
        return new int[0];
    }
}