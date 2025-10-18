class Solution {
    public int sum;
    public void helper(TreeNode root,boolean flag){
        if(root==null) return;
        if(flag==true && root.left==null && root.right==null){
            sum+=root.val;
        }

        helper(root.left,true);
        helper(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        boolean flag=false;
        sum=0;
        helper(root,flag);

        return sum;
    }
}