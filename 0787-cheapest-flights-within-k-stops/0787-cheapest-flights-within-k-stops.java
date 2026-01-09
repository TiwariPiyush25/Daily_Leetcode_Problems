class Solution {
    public class pair{
        int node;
        int cost;

        pair(int n,int c){
            this.node = n;
            this.cost = c;
        }
    }
    public class triplet{
        int node;
        int cost;
        int stop;

        triplet(int n,int c,int s){
            this.node = n;
            this.cost = c;
            this.stop = s;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<flights.length;i++){
            int from = flights[i][0] , to = flights[i][1] , cost = flights[i][2];
            adj.get(from).add(new pair(to,cost));
        }

        int[] ans = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;

        Queue<triplet> q = new LinkedList<>();
        q.add(new triplet(src,0,0));

        while(!q.isEmpty()){
            triplet top = q.remove();
            int node = top.node, cost = top.cost, stop = top.stop;

            if(stop == k+1) continue;
            for(pair p:adj.get(node)){
                int totalCost = cost + p.cost;
                if(ans[p.node] > totalCost){
                    ans[p.node] = totalCost;
                    q.add(new triplet(p.node,totalCost,stop+1));
                }
            }
        }

        return ans[dst] == Integer.MAX_VALUE ? -1 : ans[dst];
    }
}