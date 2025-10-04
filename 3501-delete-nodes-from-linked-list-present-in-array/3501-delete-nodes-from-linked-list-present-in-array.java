class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        
        ListNode temp=dummy;
        while(temp.next!=null){
            if(set.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else temp=temp.next;
        }

        return dummy.next;
    }
}