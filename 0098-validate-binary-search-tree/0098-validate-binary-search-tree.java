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
    public boolean flag;
    public long max(TreeNode root){
        if(root == null) return Long.MIN_VALUE;
        long leftmax = max(root.left);
        if(root.val <= leftmax) flag = false;
        long rightmax = max(root.right);

        return Math.max(root.val,Math.max(leftmax,rightmax));
    }
    public long min(TreeNode root){
        if(root == null) return Long.MAX_VALUE;
        long leftmin = min(root.left);
        long rightmin = min(root.right);
        if(root.val >= rightmin) flag = false;
        return Math.min(root.val,Math.min(leftmin,rightmin));
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        max(root);
        min(root);

        return flag;
    }
}