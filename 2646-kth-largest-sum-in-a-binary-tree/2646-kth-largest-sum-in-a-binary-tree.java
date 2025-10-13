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
    public int height(TreeNode root){
        if(root==null) return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }
    public void lvlOrder(TreeNode root,int n,long[] arr){
        if(root==null) return;

        lvlOrder(root.left,n-1,arr);
        arr[n-1]+=root.val;
        lvlOrder(root.right,n-1,arr);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        int h=height(root);
        long[] arr=new long[h];
        lvlOrder(root,h,arr);
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long ele:arr){
            pq.add(ele);

            if(pq.size()>k) pq.remove();
        }
        
        return pq.size()==k ? pq.peek() : -1;
    }
}