class Solution {
    public int height(TreeNode root){
        if(root==null) return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }
    public void CalculateSum(TreeNode root,int[] arr,int n){
        if(root==null) return;

        if(n==1) arr[0]+=root.val;
        CalculateSum(root.left,arr,n-1);
        CalculateSum(root.right,arr,n-1);
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);

        int[] arr={0};
        CalculateSum(root,arr,h);

        return arr[0];
    }
}