/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
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
    bool flag;
    bool isit(TreeNode* root,ListNode* head){
        if(head == NULL) return 1;
        if(root == NULL || root->val != head->val) return 0;

        return isit(root->left,head->next) || isit(root->right,head->next);
    }
    void inorder(ListNode* head,TreeNode* root){
        if(root == NULL) return;

        inorder(head,root->left);
        if(root->val == head->val){
            ListNode* temp = head;
            if(isit(root,temp)){
                flag = 1;
                return;
            }
        }
        inorder(head,root->right);
    }
    bool isSubPath(ListNode* head, TreeNode* root) {
        flag = 0;
        inorder(head,root);

        return flag;
    }
};