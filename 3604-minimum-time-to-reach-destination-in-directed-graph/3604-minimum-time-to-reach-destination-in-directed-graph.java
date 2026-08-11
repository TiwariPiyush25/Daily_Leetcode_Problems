class Solution {
    public int minTime(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0],v = edge[1],s = edge[2],e = edge[3];
            adj.get(u).add(new int[]{v,s,e});
        }

        int[] Time  = new int[n];
        Arrays.fill(Time , Integer.MAX_VALUE);

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        Time[0] = 0;
        minheap.add(new int[]{0,0});

        while(!minheap.isEmpty()){
            int[] top = minheap.remove();
            int node = top[0], time = top[1];

            if(node == n-1) return time;

            if(Time[node] < time) continue;

            for(int[] x : adj.get(node)){
                int u = x[0],s = x[1],e = x[2];

                int newtime = Math.max(time , s) + 1;
                if(newtime >= Time[u] || newtime > e) continue;

                minheap.add(new int[]{u,newtime});
                Time[u] = newtime;
            }
        }

        return -1;
    }
}