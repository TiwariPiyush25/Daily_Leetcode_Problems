class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minheap = new PriorityQueue<>();
        for(int ele:nums) minheap.add((long)ele);

        int opr = 0;
        while(minheap.peek() < k){
            long x = minheap.remove(), y = minheap.remove();

            long val = (Math.min(x,y) * 2 + Math.max(x,y));
            minheap.add(val);

            opr++;
        }

        return opr;
    }
}