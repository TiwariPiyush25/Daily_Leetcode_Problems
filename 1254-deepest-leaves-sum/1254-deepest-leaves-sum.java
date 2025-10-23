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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();

        if(root!=null) q.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();

                lst.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }

            ans.add(0,lst);
        }

        int sum=0;
        
        List<Integer> lst=ans.get(0);
        for(int ele:lst){
            sum+=ele;
        }

        return sum;
    }
}