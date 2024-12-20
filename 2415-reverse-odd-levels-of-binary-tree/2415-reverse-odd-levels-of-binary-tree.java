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
    public TreeNode reverseOddLevels(TreeNode root) {
        traverse(root.left, root.right, 0);
        return root;
    }
    
    public void traverse(TreeNode leftNode, TreeNode rightNode, int level){
        if(leftNode == null || rightNode == null){
            return;
        }
        
        if(level % 2 == 0){
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
        }
        
        traverse(leftNode.left,rightNode.right,level+1);
        traverse(leftNode.right,rightNode.left,level+1);
    }
}