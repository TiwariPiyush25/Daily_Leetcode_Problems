class Solution {
    public TreeNode helper(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return null;
        
        if(root1==null || root2==null) {
            if(root1==null) 
            {   
                root1=root2;
            }
            if(root2==null) {
                root2=root1;
            }
        }
        TreeNode root;
        if(root1!=root2){
            root = new TreeNode(root1.val+root2.val);
        }
        else root=new TreeNode(root1.val);


        TreeNode left=helper(root1.left,root2.left);
        TreeNode right=helper(root1.right,root2.right);

        root.left=left;
        root.right=right;

        return root;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return helper(root1,root2);
    }
}