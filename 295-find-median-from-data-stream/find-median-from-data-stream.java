class MedianFinder {
    PriorityQueue<Integer> left=new PriorityQueue<>(Collections.reverseOrder()); // maxheap
    PriorityQueue<Integer> right=new PriorityQueue<>(); // minheap
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(left.size()==0) left.add(num);
        else{
            if(num<left.peek()) left.add(num);
            else right.add(num);
        }

        // Balance heaps
        if(left.size()==right.size()+2){
            right.add(left.remove());
        }
        if(right.size()==left.size()+2) left.add(right.remove());
    }
    
    public double findMedian() {
        if(left.size()==right.size()){
            return (left.peek() + right.peek())/2.0;
        }
        else if(left.size()>right.size()) return left.peek();
        return right.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */