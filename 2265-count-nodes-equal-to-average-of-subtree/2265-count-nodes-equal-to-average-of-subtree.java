class Solution {
    public int sum(TreeNode root){
        if(root==null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }
    public int size(TreeNode root){
        if(root==null) return 0;

        return 1 + size(root.left) + size(root.right);
    }
    public void helper(TreeNode root,int[] counter){
        if(root==null) return;

        int avg=sum(root)/size(root);

        if(root.val==avg) counter[0]++;
        helper(root.left,counter);
        helper(root.right,counter);
    }

    public int averageOfSubtree(TreeNode root) {
        int[] counter={0};
        helper(root,counter);

        return counter[0];
    }
}