class Solution {
    public int levels(TreeNode root,Map<TreeNode,Integer> dp){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int leftlevels = levels(root.left,dp);
        int rightlevels = levels(root.right,dp);

        int val = 1 + Math.max(leftlevels,rightlevels);
        dp.put(root,val);
        return val;
    }
    public int diameter(TreeNode root,Map<TreeNode,Integer> dp){
        if(root==null) return 0;
        int mydia = levels(root.left,dp) + levels(root.right,dp);
        int leftdia = diameter(root.left,dp);
        int rightdia = diameter(root.right,dp);

        return Math.max(Math.max(leftdia,rightdia),mydia);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode,Integer> dp = new HashMap<>();
        return diameter(root,dp);
    }
}