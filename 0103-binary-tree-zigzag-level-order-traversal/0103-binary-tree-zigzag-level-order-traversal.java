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
    public int level(TreeNode root){
        if (root==null) return 0;

        return 1+ Math.max(level(root.left),level(root.right));
    }
    public class pair{
        TreeNode node;
        int lvl;

        pair(TreeNode node,int lvl){
            this.node=node;
            this.lvl=lvl;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int lvl=level(root);

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<lvl;i++){
            ans.add(new ArrayList<>());
        }
        
        Queue<pair> q=new LinkedList<>();
        
        if(root!=null) q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair front=q.remove();

            TreeNode temp = front.node;
            int currlvl = front.lvl;

            if(currlvl%2==0) ans.get(currlvl).add(temp.val);
            else ans.get(currlvl).add(0,temp.val);

            if(temp.left!=null) q.add(new pair(temp.left,currlvl+1));
            if(temp.right!=null) q.add(new pair(temp.right,currlvl+1));
        }

        return ans;
    }
}