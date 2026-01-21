class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int ele:nums){
            minheap.add(ele);
        }

        while(k-->0){
            int min = minheap.remove();
            min  += 1;
            minheap.add(min);
        }

        long product = 1;
        while(!minheap.isEmpty()){
            product = (product * minheap.remove()) % 1000000007;
        }

        return (int) product;
    }
}