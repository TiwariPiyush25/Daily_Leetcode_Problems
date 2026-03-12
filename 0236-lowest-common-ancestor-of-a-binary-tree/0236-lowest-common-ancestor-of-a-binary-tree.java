class Solution {
    public boolean exist(TreeNode root,TreeNode node){
        if(root == null) return false;
        if(root == node) return true;

        return exist(root.left,node) || exist(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;

        boolean checkleftforP = exist(root.left,p);
        boolean checkrightforq = exist(root.right,q);

        if(checkleftforP && !checkrightforq) return lowestCommonAncestor(root.left,p,q);
        if(!checkleftforP && checkrightforq) return lowestCommonAncestor(root.right,p,q);

        return root;
    }
}