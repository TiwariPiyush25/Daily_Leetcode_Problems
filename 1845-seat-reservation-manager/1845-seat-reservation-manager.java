class SeatManager {
    boolean[] arr;
    int i;
    public SeatManager(int n) {
        i = 1;
        arr = new boolean[n+1];
    }
    
    public int reserve() {
        while(arr[i] == true) i++;

        arr[i++] = true; 
        return i-1;
    }
    
    public void unreserve(int seatNumber) {
        arr[seatNumber] = false;
        i = Math.min(i,seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */