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
    public void Inorder(TreeNode root,List<TreeNode> inorder){
        if(root==null) return;

        Inorder(root.left,inorder);
        inorder.add(root);
        Inorder(root.right,inorder);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> inorder=new ArrayList<>();
        Inorder(root,inorder);
        for(TreeNode node:inorder){
            node.left=null;
            node.right=null;
        }

        for(int i=1;i<inorder.size();i++){
            inorder.get(i-1).right=inorder.get(i);
        }

        return inorder.get(0);
    }
}