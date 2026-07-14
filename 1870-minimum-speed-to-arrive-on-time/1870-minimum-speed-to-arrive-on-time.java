class Solution {
    public boolean isPossible(int speed,int[] dist,double hour){
        double time = 0.0;

        for(int i = 0;i < dist.length - 1;i++){
            double t =  ((double)dist[i] / (double) speed);
            time += Math.ceil(t);
        }

        time += (double) dist[dist.length-1] / (double) speed;
        return time <= hour;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int st = 1;
        int end = (int) 10e8;

        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;

            if(isPossible(mid,dist,hour)){
                ans = mid;
                end = mid - 1;
            }
            else st = mid + 1;
        }

        return ans;
    }
}