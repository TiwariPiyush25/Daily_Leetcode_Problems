
class Solution {
    public int sum(TreeNode root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if(leftSum == 0) root.left = null;
        if(rightSum == 0) root.right = null;

        return root.val + leftSum + rightSum;
    }
    public TreeNode pruneTree(TreeNode root) {
        int ans = sum(root);   
        return ans == 0 ? null : root;
    }
}