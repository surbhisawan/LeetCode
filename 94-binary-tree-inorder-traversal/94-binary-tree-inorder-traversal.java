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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode curr = root;
        TreeNode in;
        while(curr!=null){
            if(curr.left==null){
                result.add(curr.val);
                curr=curr.right;
            }else{
                in = curr.left;
                while(in.right!=null){
                    in=in.right;
                }
                 in.right = curr; 
                TreeNode temp = curr; 
                curr = curr.left; 
                temp.left = null;
            }
        }
        return result;
    }
}