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
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode a=head.next;
        ListNode newhead=reverse(a);
        a.next=head;
        head.next=null;

        return newhead;
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int group = 1;
        ListNode slow = head;
        ListNode fast = head;

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(fast!=null){
            int count = 1;
            while(fast.next!=null && count<group){
                fast = fast.next;
                count++;
            }

            if(count%2==0){
                ListNode Next = fast.next;
                fast.next=null;

                ListNode rev = reverse(slow);
                temp.next = rev;
                temp = slow;

                slow = Next;
                fast = Next;
            }
            else {
                temp.next = slow;
                temp = fast;
                
                fast=fast.next;
                slow=fast;
            }

            group++;
        }

        return dummy.next;
    }
}