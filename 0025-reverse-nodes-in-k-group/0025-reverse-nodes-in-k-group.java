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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode a=head.next;
        ListNode newhead=reverseList(a);
        a.next=head;
        head.next=null;

        return newhead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;

        int count=1;
        while(fast!=null){
            if(count==k){
                ListNode Next = fast.next;
                fast.next=null;

                ListNode rev = reverseList(slow);
                count=1;

                temp.next = rev;
                temp = slow;

                slow = Next;
                fast = Next;
            }
            else {
                fast = fast.next;
                count++;
            }
        }
        temp.next = slow;
        
        return dummy.next;
    }
}