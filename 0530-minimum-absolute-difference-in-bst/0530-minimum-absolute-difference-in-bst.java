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
    public int mindiff;
    public TreeNode prev;
    public void helper(TreeNode root){
        if(root==null) return;

        helper(root.left);
        if(prev!=null){
            int diff = Math.abs(prev.val - root.val);
            mindiff = Math.min(diff,mindiff);
        }
        prev = root;
        helper(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        mindiff = Integer.MAX_VALUE;
        prev = null;
        helper(root);

        return mindiff;
    }
}