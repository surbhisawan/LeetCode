class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        TreeMap<Integer, String> map = new TreeMap<>();
        
        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }
        
        int idx = n - 1;
        
        String[] ans = new String[n];
        
        for(int i : map.keySet()){
            ans[idx] = map.get(i);
            idx--;
        }
        
        return ans;
    }
}