/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean flag;
    public boolean isit(TreeNode root,ListNode head){
        if(head == null) return true;
        if(root == null || root.val != head.val) return false;

        return isit(root.left,head.next) || isit(root.right,head.next);
    }
    public void inorder(ListNode head,TreeNode root){
        if(root == null) return;

        inorder(head,root.left);
        // work
        if(root.val == head.val){
            ListNode temp = head;
            if(isit(root,temp)) {
                flag = true;
                return;
            }
        }
        inorder(head,root.right);
    } 
    public boolean isSubPath(ListNode head, TreeNode root) {
        flag = false;
        inorder(head,root);

        return flag;
    }
}