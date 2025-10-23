class Solution {
    public int counter;
    public int sum(TreeNode root){
        if(root==null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }
    public int size(TreeNode root){
        if(root==null) return 0;

        return 1 + size(root.left) + size(root.right);
    }
    public void helper(TreeNode root){
        if(root==null) return;

        int avg=sum(root)/size(root);

        if(root.val==avg) counter++;
        helper(root.left);
        helper(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
        counter=0;
        helper(root);

        return counter;
    }
}