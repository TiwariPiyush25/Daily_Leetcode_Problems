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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();

        ListNode temp=head;
        while(temp!=null){
            while(!st.isEmpty() && temp.val>st.peek().val){
                st.pop();
            }

            st.push(temp);
            temp=temp.next;
        }
        // reverse the stack
        Stack<ListNode> revstack=new Stack<>();
        while(!st.isEmpty()){
           revstack.push(st.pop());
        }

        ListNode dummy=new ListNode(-1);
        temp=dummy;
        while(!revstack.isEmpty()){
            temp.next=revstack.pop();
            temp=temp.next;
        }

        return dummy.next;
    }
}