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
    public int maxSum;
    public int pathSum(TreeNode root){
        if(root == null) return 0;

        int pathsum = root.val;
        int leftpathSum = pathSum(root.left);
        int rightpathSum = pathSum(root.right);
        if(leftpathSum > 0) pathsum += leftpathSum;
        if(rightpathSum > 0) pathsum += rightpathSum;
        maxSum = Math.max(maxSum , pathsum);

        return root.val + Math.max(0,Math.max(leftpathSum,rightpathSum));
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        pathSum(root);
        return maxSum;
    }
}