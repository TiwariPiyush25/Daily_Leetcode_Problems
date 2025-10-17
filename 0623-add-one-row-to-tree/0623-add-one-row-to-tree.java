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
    public void helper(TreeNode root,int val,int d){
        if(root==null) return;

        helper(root.left,val,d-1);
        if(d==1){
            TreeNode left=root.left;
            TreeNode right=root.right;

            TreeNode newleft=new TreeNode(val);
            TreeNode newright=new TreeNode(val);

            root.left=newleft;
            root.right=newright;

            newleft.left=left;
            newright.right=right;
        }
        helper(root.right,val,d-1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newroot=new TreeNode(val);
            newroot.left=root;

            return newroot;
        }
        helper(root,val,depth-1);

        return root;
    }
}