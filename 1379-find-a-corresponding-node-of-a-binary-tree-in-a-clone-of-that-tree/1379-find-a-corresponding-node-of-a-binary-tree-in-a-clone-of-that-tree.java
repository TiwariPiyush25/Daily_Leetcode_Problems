/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode ans; 
    public void inorder(TreeNode root,TreeNode target){
        if(root == null) return;

        inorder(root.left,target);
        if(root.val == target.val) {
            ans = root;
            return;
        }
        inorder(root.right,target);
    } 
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ans = null;
        inorder(cloned,target);
        return ans;
    }
}