class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null) return root.val==0 ? false : true;

        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);

        int val=root.val;

        if(val==2 && (left || right)) return true;
        else if(val==3 && (left && right)) return true;
        return false;
    }
}