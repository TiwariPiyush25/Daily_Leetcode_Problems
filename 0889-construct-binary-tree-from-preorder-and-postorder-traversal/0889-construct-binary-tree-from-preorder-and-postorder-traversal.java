/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int lopr,int hipr,int[] preorder,int lopo,int hipo,int[] postorder){
        if(lopr > hipr || lopo > hipo) return null;
        TreeNode root = new TreeNode(preorder[lopr]);
        if(lopr == hipr) return root;

        int i;
        for(i = lopo;i <= hipo;i++){
            if(preorder[lopr+1] == postorder[i]) break;
        }
        int len = i-lopo+1;
        root.left = buildTree(lopr+1,lopr+len,preorder,lopo,i,postorder);
        root.right = buildTree(lopr+len+1,hipr,preorder,i+1,hipo-1,postorder);

        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        if(n == 0) return null;
        TreeNode root = buildTree(0,n-1,preorder,0,n-1,postorder);

        return root;
    }
}