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
    unordered_map<int, int> map;
    
    bool findTarget(TreeNode* root, int k) {
        if(root==NULL)
            return false;
        
        if(map[k-root->val]==1)
            return true;
        
        map[root->val]=1;
        return findTarget(root->left, k) || findTarget(root->right, k);
    }
};