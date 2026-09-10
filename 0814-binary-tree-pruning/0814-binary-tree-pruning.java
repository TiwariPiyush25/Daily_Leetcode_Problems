
class Solution {
    public int sum(TreeNode root){
        return (root == null) ? 0 : (root.val + sum(root.left) + sum(root.right));
    }
    public void helper(TreeNode root){
        if(root == null) return;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if(leftSum == 0) root.left = null;
        if(rightSum == 0) root.right = null;

        helper(root.left);
        helper(root.right);
    }
    public TreeNode pruneTree(TreeNode root) {
        if(sum(root) == 0) return null;
        
        helper(root);
        return root;
    }
}