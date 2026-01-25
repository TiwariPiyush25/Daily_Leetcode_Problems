class MyCircularDeque {
    ArrayList<Integer> arr;
    int size;

    public MyCircularDeque(int k) {
        size = k;
        arr = new ArrayList<>();
    }
    
    public boolean insertFront(int value) {
        if(arr.size() >= size) return false;
        arr.add(0,value);
        return true;
    }
    
    public boolean insertLast(int value) {
        if(arr.size() >= size) return false;
        arr.add(value);
        return true;
    }
    
    public boolean deleteFront() {
        if(arr.size() == 0) return false;

        arr.remove(0);
        return true;
    }
    
    public boolean deleteLast() {
        if(arr.size() == 0) return false;
        arr.remove(arr.size()-1);
        return true;
    }
    
    public int getFront() {
        if(arr.size() == 0) return -1;
        return arr.get(0);
    }
    
    public int getRear() {
        if(arr.size()==0) return -1;
        return arr.get(arr.size()-1);
    }
    
    public boolean isEmpty() {
        if(arr.size()==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(arr.size()==size) return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */