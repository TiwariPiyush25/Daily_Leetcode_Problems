class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:gifts){
            maxheap.offer(ele);
        }

        while(k-->0){
            int val = maxheap.remove();
            val = (int) Math.sqrt(val);
            maxheap.add(val);
        }

        long finalGift= 0;
        while(!maxheap.isEmpty()){
            finalGift += maxheap.poll();
        }

        return finalGift;
    }
}