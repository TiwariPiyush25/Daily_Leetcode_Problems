class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {
        int[] time = new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[src] = 0;

        for(int iteration=1;iteration<=n-1;iteration++){ // n-1 time relaxation
            for(int[] t:times){
                int u = t[0],v = t[1],wt = t[2];

                if(time[u]!=Integer.MAX_VALUE && time[u] + wt < time[v]){ // relaxation
                    time[v] = time[u] + wt;
                }
            }
        }
        // find maximum time 
        int max = Integer.MIN_VALUE;
        for(int i=1;i<time.length;i++){
            int ele = time[i];
            max = Math.max(max,ele);
        }

        return max == Integer.MAX_VALUE ? -1 : max;
    }
}