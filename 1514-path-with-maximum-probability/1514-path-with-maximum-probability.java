class Solution {
    public class pair implements Comparable<pair>{
        int node;
        double pro;

        pair(int n,double p){
            this.node = n;
            this.pro = p;
        }

        public int compareTo(pair p){
            if(this.pro == p.pro) return this.node - p.node;
            return Double.compare(this.pro,p.pro);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int src, int dest) {
        // create adj List
        List<List<pair>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            double pro = succProb[i];

            adj.get(node1).add(new pair(node2,pro));
            adj.get(node2).add(new pair(node1,pro));
        }

        // Apply Dijkstra Algorithm
        double[] probability = new double[n];
        probability[src] = 1;

        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxheap
        pq.add(new pair(src,1));

        while(!pq.isEmpty()){
            pair top = pq.remove();

            if(top.pro < probability[top.node]) continue;
            for(pair p:adj.get(top.node)){
                double totalpro = top.pro * p.pro;
                if(totalpro > probability[p.node]){
                    probability[p.node] = totalpro;
                    pq.add(new pair(p.node,totalpro));
                }
            }
        }
        
        return probability[dest];
    }
}