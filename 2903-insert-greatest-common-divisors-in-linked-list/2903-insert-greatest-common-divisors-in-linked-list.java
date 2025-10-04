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
    public int gcd(int x,int y){
        if (y%x==0) return x;

        return gcd(y%x,x);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;

        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null){
            int v1=slow.val , v2=fast.val;
            int GCD=gcd(v1,v2);
            ListNode temp=new ListNode(GCD);
            temp.next=fast;
            slow.next=temp;

            slow=fast;
            fast=fast.next;
        }

        return head;
    }
}