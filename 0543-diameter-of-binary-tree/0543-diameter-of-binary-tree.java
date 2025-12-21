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
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);

        return 1 + Math.max(leftlevels,rightlevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int mydia = levels(root.left) + levels(root.right);
        int leftdia = diameterOfBinaryTree(root.left);
        int rightdia = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(leftdia,rightdia),mydia);
    }
}