class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length;

        List<List<int[]>> adj = new ArrayList<>();

        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0],v = edge[1],t = edge[2];

            adj.get(u).add(new int[]{v , t});
            adj.get(v).add(new int[]{u , t});
        }

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        int[][] dist = new int[n][maxTime + 1];
        for(int[] d:dist) Arrays.fill(d,Integer.MAX_VALUE);

        minheap.add(new int[]{0,passingFees[0],0});
        dist[0][0] = passingFees[0];

        while(minheap.size() > 0){
            int[] top = minheap.remove();
            int node = top[0],cost = top[1],time = top[2];

            if(node == n-1) return cost;
            if(cost > dist[node][time]) continue;

            for(int[] a:adj.get(node)){
                int x = a[0], t = a[1];

                int newTime = time + t;
                if(newTime > maxTime) continue;
                
                int newCost = passingFees[x] + cost;
                if(newCost < dist[x][newTime]){
                    minheap.add(new int[]{x,newCost,newTime});
                    dist[x][newTime] = newCost;
                }
            }
        }

        return -1;
    }
}