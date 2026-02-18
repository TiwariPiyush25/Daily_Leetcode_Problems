class Solution {
    public boolean flag;
    public boolean isSame(TreeNode A,TreeNode B){
        if(A==null && B==null) return true;
        if(A==null || B==null) return false;

        if(A.val!=B.val) return false;
        if(isSame(A.left,B.left)==false) return false;
        if(isSame(A.right,B.right)==false) return false;
        return true;
    }
    public void inorder(TreeNode root,TreeNode subRoot){
        if(root==null)return;

        inorder(root.left,subRoot);
        if(!flag && root.val == subRoot.val){
            flag = isSame(root,subRoot);
        }
        inorder(root.right,subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        flag = false;
        inorder(root,subRoot);
        return flag;
    }
}