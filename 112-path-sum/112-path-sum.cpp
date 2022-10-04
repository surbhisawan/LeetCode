/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    bool sum(TreeNode* root, int targetSum, int sm=0){
        if(root==NULL)
            return false;
        
        sm+=root->val;
        
        if(targetSum==sm && root->left==NULL && root->right==NULL)
            return true;
        
        return sum(root->left, targetSum, sm)||sum(root->right, targetSum, sm);
    }
    
    bool hasPathSum(TreeNode* root, int targetSum) {
        return sum(root, targetSum, 0);
    }
};