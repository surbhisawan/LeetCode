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
    
    TreeNode xparent = null, yparent = null;
    int xht = -1 , yht = -1;
    
    public void solve(TreeNode root, int x, int y, int height, TreeNode parent){
        if(root == null)
            return; 
        
        if(root.val == x){
            xparent = parent;
            xht = height;
        }else if(root.val == y){
            yparent = parent;
            yht = height;
        }
        
        solve(root.left, x, y, height+1, root);
        solve(root.right, x, y, height+1, root);
    }
    
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y)
            return false;
        
        solve(root, x, y, 0, null);
        
        return (xparent != yparent && xht == yht)?true:false;
    }
}


