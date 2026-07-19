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
    public int MaxOfSubtree(TreeNode root){
        if(root == null) return 0;

        return Math.max(root.val,Math.max(MaxOfSubtree(root.left),MaxOfSubtree(root.right)));
    }
    public int postOrder(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        int max = MaxOfSubtree(root);

        int ans = postOrder(root.left) + postOrder(root.right);
        if(root.val >= max) ans++;

        return ans;
    }
    public int countDominantNodes(TreeNode root) {
        return postOrder(root);
    }
}