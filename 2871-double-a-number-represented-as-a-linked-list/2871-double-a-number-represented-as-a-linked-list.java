class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<ListNode> st=new Stack<>();

        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }

        int carry=0;
        while(!st.isEmpty()){
            int val=(st.peek().val * 2);
            st.peek().val=(val+carry)%10;
            carry=val/10;
            st.pop();
        }

        if(carry>0){
            ListNode dummy=new ListNode(carry);
            dummy.next=head;
            return dummy;
        }


        return head;
    }
}