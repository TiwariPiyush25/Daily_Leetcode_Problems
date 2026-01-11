class Solution {
    public class triplet implements Comparable<triplet>{
        int node;
        int parent;
        int dist;
        
        triplet(int n,int p,int d){
            this.node = n;
            this.parent = p;
            this.dist = d;
        }
        
        public int compareTo(triplet t){
            if(this.dist == t.dist) return this.node - t.node;
            return this.dist - t.dist;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n= points.length;
        boolean[] vis = new boolean[n];

        int sum = 0;
        PriorityQueue<triplet> pq = new PriorityQueue<>(); 
        pq.add(new triplet(0,-1,0));
        while(!pq.isEmpty()){
            triplet top = pq.remove();
            int node = top.node, parent = top.parent,dist = top.dist;

            if(vis[node]) continue;
            vis[node] = true;
            sum += dist; 
            for(int i=0;i<n;i++){
                if(i==node || i==parent || vis[i]) continue;
                int x1 = points[node][0] ,y1 = points[node][1];
                int x2 = points[i][0] , y2 = points[i][1];

                int mdist = Math.abs(x1-x2) + Math.abs(y1-y2);
                pq.add(new triplet(i,node,mdist));
            }
        }

        return sum;
    }
}