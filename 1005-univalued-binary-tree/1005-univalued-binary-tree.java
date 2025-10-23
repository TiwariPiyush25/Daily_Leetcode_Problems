class Solution {
    public boolean helper(TreeNode root,int val){
        if(root==null) return true;

        if(root.val!=val) return false;
        boolean left=helper(root.left,val);
        boolean right=helper(root.right,val);

        return left && right;
    }
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val; // roots value
        
        return helper(root,val);
    }
}