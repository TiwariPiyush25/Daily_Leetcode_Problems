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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root== null) return new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode front = q.remove();
                temp.add(front.val);

                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }

            ans.add(temp);
        }

        return ans;
    }
}