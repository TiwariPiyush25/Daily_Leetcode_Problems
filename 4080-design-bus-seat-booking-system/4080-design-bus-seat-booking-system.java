class BusBooking {
    int[][] arr;
    int[][] cost;
    int cnt = 0;
    int time = 0;
    public BusBooking(int n) {
        arr = new int[n][4];
        cost = new int[n][4];
    }
    
    public void toggle(String seat) {
        char Seat = seat.charAt(0);
        int row = Integer.parseInt(seat.substring(1)) - 1;
        int idx = (int) Seat - 'A';

        if(arr[row][idx] == 1){
                cnt--;
                time -= cost[row][idx];
                arr[row][idx] = 0;
                cost[row][idx] = 0;
        }
        else {
            if(idx == 1 || idx == 2){
                cnt++;
                time++;
                arr[row][idx] = 1;
                cost[row][idx] = 1;
            }
            else {
                cnt++;
                if((idx == 0 && arr[row][1] == 1) || (idx == 3 && arr[row][2] == 1)){
                    time += 3;
                    cost[row][idx] = 3;
                }
                else {
                    time++;
                    cost[row][idx] = 1;
                }
                arr[row][idx] = 1;
            }
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