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
    public int levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root!=null) q.add(root);

        while(!q.isEmpty()){
            List<Integer> lst=new ArrayList<>();
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                lst.add(temp.val);

                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            
            ans.add(lst);
        }

        return ans.get(ans.size()-1).get(0);
    }
    public int findBottomLeftValue(TreeNode root) {
        return levelOrder(root);
    }
}