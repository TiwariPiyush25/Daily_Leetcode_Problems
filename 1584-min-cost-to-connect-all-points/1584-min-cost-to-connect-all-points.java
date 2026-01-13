class Solution {
    public class Edge implements Comparable<Edge>{
        int u;
        int v;
        int dist;

        Edge(int u,int v,int d){
            this.u = u;
            this.v = v;
            this.dist = d;
        }

        public int compareTo(Edge t){
            if(this.dist == t.dist) return this.u - t.u;
            return this.dist - t.dist;
        }
    }
    public int[] parent;
    public int[] size;
    public int leader(int u){
        if(parent[u]==u) return u;
        
        return parent[u] = leader(parent[u]);
    }
    public void union(int u,int v){
        int a = leader(u);
        int b = leader(v);

        if(a != b){
            if(size[a]  >size[b]){
                parent[b] = a;
                size[a] += size[b];
            }
            else{
                parent[a] = b;
                size[b] += size[a];
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        parent = new int[n];
        size = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }

        ArrayList<Edge> list = new ArrayList<>();
        for(int u=0;u<n;u++){
            for(int v=u+1;v<n;v++){
                int x1 = points[u][0] , y1 = points[u][1];
                int x2 = points[v][0] , y2 = points[v][1];

                int dist = Math.abs(x1-x2) + Math.abs(y1-y2);

                list.add(new Edge(u,v,dist));
            }
        }

        Collections.sort(list);
        
        int minCost = 0;
        for(int i=0;i<list.size();i++){
            Edge top = list.get(i);
            int u = top.u,v = top.v,dist = top.dist;

            if(leader(u)!=leader(v)){
                minCost += dist;
                union(u,v);
            }
        }

        return minCost;
    }
}