class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null) return head;
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }

        for(int i=0;i<arr.size();i++){
            arr.get(i).next=null;
            int j=i;
            while(j>0 && arr.get(j).val<arr.get(j-1).val){
                ListNode t=arr.get(j);
                arr.set(j,arr.get(j-1));
                arr.set(j-1,t);

                j--;
            }
        }

        ListNode newhead=arr.get(0);
        temp=newhead;
        for(int i=1;i<arr.size();i++){
            temp.next=arr.get(i);
            temp=temp.next;
        }

        return newhead;
    }
}