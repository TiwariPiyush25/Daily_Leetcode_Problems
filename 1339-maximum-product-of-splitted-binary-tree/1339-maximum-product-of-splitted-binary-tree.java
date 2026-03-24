class Solution {
    public long mod = 1000000007;
    static long totalSum , maxValue;
    public HashMap<TreeNode,Long> dp1;
    public HashMap<TreeNode,Long> dp2;
    public long Sum(TreeNode root){
        if(root == null) return 0;
        if(dp2.containsKey(root)) return dp2.get(root);

        dp2.put(root,(root.val + (long)Sum(root.left) + (long)Sum(root.right))%mod);
        return (root.val + (long)Sum(root.left) + (long)Sum(root.right))%mod;
    }
    public long helper(TreeNode root){
        totalSum = Math.max(Sum(root),totalSum);
        if(root == null) return 1;

        if(dp1.containsKey(root)) return dp1.get(root);

        long leftSum = Sum(root.left) % mod;
        long rightSum = Sum(root.right) % mod;

        long leftSplitProd = ((totalSum - leftSum) * leftSum);
        long rightSplitProd=  ((totalSum - rightSum) * rightSum);

        long maxProductleft = helper(root.left);
        long maxProductright = helper(root.right);

        maxValue = Math.max(maxValue,Math.max(leftSplitProd,rightSplitProd));
        dp1.put(root,maxValue%mod);
        return maxValue % mod;
    }
    public int maxProduct(TreeNode root) {
        dp1 = new HashMap<>();
        dp2 = new HashMap<>();
        totalSum = Long.MIN_VALUE;
        maxValue = Long.MIN_VALUE;

        return (int) helper(root);
    }
}