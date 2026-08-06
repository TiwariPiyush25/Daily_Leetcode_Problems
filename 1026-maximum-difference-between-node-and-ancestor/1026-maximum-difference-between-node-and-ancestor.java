class Solution {
    public int maxDiff;
    public int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.val ,Math.max(max(root.left),max(root.right)));
    }
    public int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val ,Math.min(min(root.left),min(root.right)));
    }
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        // work
        int v1 = max(root); int v2 = min(root);
        int max = (v1 == Integer.MIN_VALUE) ? root.val : v1;
        int min = (v2 == Integer.MAX_VALUE) ? root.val : v2;

        int diff = Math.max(Math.abs(root.val - min) , Math.abs(root.val - max));
        maxDiff = Math.max(maxDiff , diff);
        inorder(root.right);
    }
    public int maxAncestorDiff(TreeNode root) {
        maxDiff = Integer.MIN_VALUE;

        inorder(root);
        return maxDiff;
    }
}