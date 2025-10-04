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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;

        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }

        int n=arr.size();
        int t=arr.get(k-1);
        arr.set(k-1,arr.get(n-k));
        arr.set(n-k,t);

        temp=head;
        for(int ele:arr){
            temp.val=ele;
            temp=temp.next;
        }

        return head;
    }
}