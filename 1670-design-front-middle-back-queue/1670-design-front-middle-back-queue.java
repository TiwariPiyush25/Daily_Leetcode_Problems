class FrontMiddleBackQueue {
    List<Integer> arr;
    public FrontMiddleBackQueue() {
        arr = new ArrayList<>();
    }
    
    public void pushFront(int val) {
        arr.add(0,val);
    }
    
    public void pushMiddle(int val) {
        int mid = (arr.size())/2;
        arr.add(mid,val);
    }
    
    public void pushBack(int val) {
        arr.add(val);
    }
    
    public int popFront() {
        if(arr.size()==0) return -1;
        int x  = arr.remove(0);
        return x;
    }
    
    public int popMiddle() {
        if(arr.size()==0) return -1;
        int mid = (arr.size()-1)/2; // left middle
        int x  = arr.remove(mid);
        return x;
    }
    
    public int popBack() {
        if(arr.size()==0) return -1;
        int x  = arr.remove(arr.size()-1);
        return x;
    }
}