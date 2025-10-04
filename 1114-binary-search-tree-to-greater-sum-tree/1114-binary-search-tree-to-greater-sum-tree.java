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
    public void Inorder(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null) return;

        Inorder(root.left,arr);
        arr.add(root);
        Inorder(root.right,arr);
    }
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        Inorder(root,arr);

        int n=arr.size();
        for(int i=n-2;i>=0;i--){
            int a=arr.get(i).val;
            int b=arr.get(i+1).val;
            arr.get(i).val=a+b;
        }

        return root;
    }
}