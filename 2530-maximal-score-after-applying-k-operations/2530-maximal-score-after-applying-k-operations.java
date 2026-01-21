class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:nums){
            maxheap.offer(ele);
        }

        long score = 0;
        while(k-->0){
            int val = maxheap.remove();
            score += val;

            val = (int) Math.ceil((double)val/3);
            maxheap.add(val);
        }

        return score;
    }
}