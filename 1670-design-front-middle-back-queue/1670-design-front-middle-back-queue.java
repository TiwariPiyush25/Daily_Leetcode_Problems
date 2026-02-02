class FrontMiddleBackQueue {
    List<Integer> arr;
    public FrontMiddleBackQueue() {
        arr = new ArrayList<>();
    }
    public void pushFront(int val) {
        arr.add(0,val);
    }
    public void pushMiddle(int val) {
        arr.add(arr.size()/2,val);
    }
    public void pushBack(int val) {
        arr.add(val);
    }
    public int popFront() {
        return arr.size()==0 ? -1 : arr.remove(0);
    }
    public int popMiddle() {
        return arr.size()==0 ? -1 : arr.remove((arr.size()-1)/2); // left middle
    }
    public int popBack() {
        return arr.size()==0 ? -1 : arr.remove(arr.size()-1);
    }
}