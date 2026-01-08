class Solution {
    public class pair implements Comparable<pair>{
        int node;
        int time;

        pair(int n,int t){
            this.node = n;
            this.time = t;
        }

        public int compareTo(pair p){
            return this.time - p.time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int src) {
        // create adj List
        List<List<pair>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++) adj.add(new ArrayList<>());

        for(int[] arr:times){
            int node1 = arr[0];
            int node2 = arr[1];
            int time = arr[2];

            adj.get(node1).add(new pair(node2,time));
        }

        // Apply Dijkstra Algorithm
        int[] time = new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[src] = 0;

        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src,0));

        while(!pq.isEmpty()){
            pair top = pq.remove();

            if(top.time > time[top.node]) continue;
            for(pair p:adj.get(top.node)){
                int totaltime = top.time + p.time;
                if(totaltime < time[p.node]){
                    time[p.node] = totaltime;
                    pq.add(new pair(p.node,totaltime));
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