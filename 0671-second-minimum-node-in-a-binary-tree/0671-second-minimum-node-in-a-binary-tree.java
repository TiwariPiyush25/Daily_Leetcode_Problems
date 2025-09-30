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
    long min=Long.MAX_VALUE;
    long smin=Long.MAX_VALUE;
    public void helper(TreeNode root){
        if(root==null) return;

        if(root.val<min){
            smin=min;
            min=root.val;
        }
        else if(root.val<smin && root.val!=min){
            smin=root.val;
        }

        helper(root.left);
        helper(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        min=Long.MAX_VALUE;
        smin=Long.MAX_VALUE;

        helper(root);
        if(smin==Long.MAX_VALUE) return -1;
        return (int) smin;
    }
}