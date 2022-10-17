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
    
    void traversal(TreeNode* root, vector<int>& vec){
        if(!root)
            return;
        vec.push_back(root->val);
        traversal(root->left, vec);
        traversal(root->right,vec);
    }
    
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int>vec;
        traversal(root,vec);
        return vec;
    }
};