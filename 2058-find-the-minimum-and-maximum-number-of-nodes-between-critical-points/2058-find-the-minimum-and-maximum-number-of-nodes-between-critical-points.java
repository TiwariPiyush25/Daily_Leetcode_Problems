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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr={-1,-1};
        ListNode left=head;
        ListNode mid=head.next;
        ListNode right=head.next.next;
        int first= -1;
        int last= -1;
        int idx=1;

        int mindist=Integer.MAX_VALUE;
        while(right!=null){
            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
                if(first==-1) first = idx;
                if(last!=-1){
                    int dist=idx - last;
                    mindist=Math.min(mindist,dist);
                }
                last=idx;
            }
            idx++;
            left=left.next;
            mid=mid.next;
            right=right.next;
        }
        if(first==last) return arr; // 0 or 1 critical points
        int maxdist=last-first;
        arr[0]=mindist;
        arr[1]=maxdist;

        return arr;
    }
}