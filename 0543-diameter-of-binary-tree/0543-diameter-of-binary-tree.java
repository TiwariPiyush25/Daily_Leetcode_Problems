class Solution {
    static Map<TreeNode,Integer> dp;
    public int levels(TreeNode root){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);

        int val = 1 + Math.max(leftlevels,rightlevels);
        dp.put(root,val);
        return val;
    }
    public int diameter(TreeNode root){
        if(root==null) return 0;
        int mydia = levels(root.left) + levels(root.right);
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);

        return Math.max(Math.max(leftdia,rightdia),mydia);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dp = new HashMap<>();
        return diameter(root);
    }
}