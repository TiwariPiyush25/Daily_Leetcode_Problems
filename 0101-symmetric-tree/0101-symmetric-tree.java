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
    public void invert(TreeNode root){
        if(root == null) return;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
    }
    public boolean isSame(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;

        return isSame(root1.left,root2.left) && isSame(root1.right,root2.right); 
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.right);
        return isSame(root.left,root.right);
    }
}