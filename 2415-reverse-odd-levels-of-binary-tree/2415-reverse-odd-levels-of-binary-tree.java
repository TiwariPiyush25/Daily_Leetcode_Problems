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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<TreeNode>> ans = new ArrayList<>();

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();

            List<TreeNode> temp = new ArrayList<>();

            for(int i = 0;i < size;i++) {
                TreeNode top = q.remove();

                temp.add(top);
                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);
            }

            ans.add(temp);
        }

        
        for(int i = 0;i < ans.size() - 1;i++){
            if(i % 2 == 0) Collections.reverse(ans.get(i+1));
            for(int j = 0;j < ans.get(i).size();j++){
                int idx = j + 1;
                ans.get(i).get(j).left = ans.get(i+1).get(2*(idx - 1));
                ans.get(i).get(j).right = ans.get(i+1).get(2*idx - 1);
            }
        }

        return ans.get(0).get(0);
    }
}