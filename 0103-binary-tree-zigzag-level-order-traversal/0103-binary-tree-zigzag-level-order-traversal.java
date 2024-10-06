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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(root == null){
            return result;
        }
        
        q.offer(root);
        
        boolean flag = true;
        
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                
                TreeNode node = q.peek();
                
                ans.add(node.val);
                
                if(node.left != null){
                    q.offer(node.left);
                }
                
                if(node.right != null){
                    q.offer(node.right);
                }
                
                q.poll();
            
            }
            
            if(!flag){
                    Collections.reverse(ans);
                }
            
            flag = !flag;
            result.add(ans);
        }
        return result;
    }
}