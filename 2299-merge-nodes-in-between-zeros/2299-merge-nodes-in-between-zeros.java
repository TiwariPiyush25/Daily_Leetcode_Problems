class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        boolean flag=false;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(fast!=null){
            int sum=0;
            while(fast.val!=0){
                sum+=fast.val;
                fast=fast.next;
            }

            ListNode newNode=null;
            if(fast.val==0){
                newNode = new ListNode(sum);
                temp.next=newNode;
                newNode.next=fast.next;
            }
            if(flag==false){
                temp.next=newNode;
                flag=true;
            }
            
            slow=fast;
            fast=fast.next;
            temp=temp.next;
        }

        return dummy.next;
    }
}