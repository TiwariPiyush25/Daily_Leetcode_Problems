class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:piles){
            maxheap.offer(ele);
        }

        while(k-->0){
            int val = maxheap.poll();
            val = val - (int) Math.floor((double)val/2);
            maxheap.add(val);
        }

        int totalStone = 0;
        while(!maxheap.isEmpty()){
            totalStone += maxheap.poll();
        }

        return totalStone;
    }
}