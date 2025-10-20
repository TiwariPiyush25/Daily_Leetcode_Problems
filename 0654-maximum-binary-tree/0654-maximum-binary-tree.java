class Solution {
    public TreeNode buildTree(int[] arr,int st,int end){
        if(st>end) return null;

        int max=Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=st;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }

        TreeNode root=new TreeNode(max);

        TreeNode leftTree = buildTree(arr,st,maxidx-1);
        TreeNode rightTree = buildTree(arr,maxidx+1,end);

        root.left = leftTree;
        root.right = rightTree;

        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root=buildTree(nums,0,nums.length-1);

        return root;
    }
}