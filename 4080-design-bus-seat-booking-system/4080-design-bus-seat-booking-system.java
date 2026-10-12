class BusBooking {
    int[][] arr;
    int[][] cost;
    int cnt = 0 , time = 0;
    public BusBooking(int n) {
        arr = new int[n][4];
        cost = new int[n][4];
    }
    
    public void toggle(String seat) {
        int row = Integer.parseInt(seat.substring(1)) - 1;
        int idx = (int) seat.charAt(0) - 'A';

        if(arr[row][idx] == 1){
                cnt--;
                time -= cost[row][idx];
                arr[row][idx] = 0;
                cost[row][idx] = 0;
        }
        else {
            if((idx == 0 && arr[row][1] == 1) || (idx == 3 && arr[row][2] == 1)) cost[row][idx] = 3;
            else cost[row][idx] = 1;
            
            time += cost[row][idx];
            cnt++;
            arr[row][idx] = 1;
        }
        
    }
    
    public int getTotalTime() {
        return time;
    }
    
    public int getMinTime() {
        return cnt;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */