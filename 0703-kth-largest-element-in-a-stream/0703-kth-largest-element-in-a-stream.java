class KthLargest {
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    int K ;
    public KthLargest(int k, int[] nums) {
        K = k;
        for(int ele:nums){
            minheap.add(ele);
            if(minheap.size() > k) minheap.remove();
        }
    }
    
    public int add(int val) {
        minheap.add(val);
        if(minheap.size() > K) minheap.remove();

        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */