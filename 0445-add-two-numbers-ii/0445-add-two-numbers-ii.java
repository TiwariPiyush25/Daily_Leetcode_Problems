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
        Stack<ListNode> st1=new Stack<>();
        Stack<ListNode> st2=new Stack<>();
        Stack<ListNode> res=new Stack<>();

        ListNode newhead=new ListNode(-1);

        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null){
            st1.push(temp1);
            temp1=temp1.next;
        }

        while(temp2!=null){
            st2.push(temp2);
            temp2=temp2.next;
        }
        ListNode temp=newhead;
        int carry=0;
        while(!st1.isEmpty() || !st2.isEmpty()){
            int v1=0; if(!st1.isEmpty()) v1=st1.pop().val;
            int v2=0; if(!st2.isEmpty()) v2=st2.pop().val;

            int val=(v1+v2+carry)%10;
            ListNode dummy=new ListNode(val);
            res.push(dummy);
            carry=(v1+v2+carry)/10;
        }
        if(carry>0){
            ListNode dummy=new ListNode(carry);
            res.push(dummy);
        }

        while(!res.isEmpty()){
            temp.next=res.pop();
            temp=temp.next;
        }

        return newhead.next;
    }
}