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
    
    long min = Long.MAX_VALUE;
    long smin = Long.MAX_VALUE;
    
    public void find(TreeNode root){
        if(root == null){
            return;
        }
        
        min = Math.min(min,root.val);
        
        if(root.val < smin && root.val != min){
            smin = root.val;
        }
        
        find(root.left);
        find(root.right);
    }
    
    public int findSecondMinimumValue(TreeNode root) {
        find(root);
        
        return (smin == Long.MAX_VALUE)?-1:(int)smin;
        
    }
    
    
}