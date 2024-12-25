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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> node = new LinkedList<>();
        
        if(root == null){
            return new ArrayList<>();
        }
        
        node.add(root);
        ans.add(root.val);
        
        while(!node.isEmpty()){
            
            int size = node.size();
            int max = Integer.MIN_VALUE;
            
            for(int i = 0 ; i < size; i++){
                TreeNode temp = node.poll();
                
                if(temp.left != null){
                    if(max < temp.left.val){
                        max = temp.left.val;
                    }
                    node.add(temp.left);
                }
                
                if(temp.right != null){
                    if(max < temp.right.val){
                        max = temp.right.val;
                    }
                    node.add(temp.right);
                }
            }
            
            ans.add(max);
        }
        
        ans.remove(ans.size()-1);
        
        return ans;
    }
}