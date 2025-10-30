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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        int carry=0;
        while(l1!=null || l2!=null){
            int v1=0; if(l1!=null) v1=l1.val;
            int v2=0; if(l2!=null) v2=l2.val;
            int num=v1+v2+carry;
            ListNode newNode=new ListNode(num%10);
            temp.next=newNode;

            temp=temp.next;

            if(num>9) carry=1;
            else carry=0;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        if(carry==1){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
        }

        return dummy.next;
    }
}