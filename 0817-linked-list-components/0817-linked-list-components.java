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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int ele:nums){
            set.add(ele);
        }

        ListNode slow = head;
        ListNode fast = head;

        int count = 0;
        while(fast!=null){
            if(set.contains(fast.val)){
                fast = fast.next;
            }
            else {
                if(slow!=fast) count++;

                fast = fast.next;
                slow = fast;
            }
        }
        if(slow!=fast) count++;

        return count;
    }
}