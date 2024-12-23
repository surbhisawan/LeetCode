/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int getMinSwaps(int[] val){
        int swap = 0;
        int[] target = val.clone();
        Arrays.sort(target);
        
        Map<Integer,Integer> pos = new HashMap<>();
        for(int i = 0; i < val.length; i++){
            pos.put(val[i],i);
        }
        
        for (int i = 0; i < val.length; i++) {
            if (val[i] != target[i]) {
                swap++;

                // Update position of swapped values
                int curPos = pos.get(target[i]);
                pos.put(val[i], curPos);
                val[curPos] = val[i];
            }
        }
        return swap;
    }
    
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            int[] val = new int[size];
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                val[i] = node.val;
                
                if(node.left!=null){
                    q.add(node.left);
                }
                
                if(node.right!=null){
                    q.add(node.right);
                }    
            }
            ans += getMinSwaps(val);
        }
        return ans;
    }
}