class Solution {
    public class pair implements Comparable<pair>{
        long dist;
        int node;
        
        pair(long d,int n){
            this.dist = d;
            this.node = n;
        }
        
        public int compareTo(pair p){
            return Long.compare(this.dist,p.dist);
        }
    }
    public int countPaths(int n, int[][] roads) {
       List<List<pair>> adj = new ArrayList<>();
       for(int i=0;i<n;i++) adj.add(new ArrayList<>());
       
       for(int[] road : roads){
           int u = road[0] , v = road[1], dist = road[2];
           adj.get(u).add(new pair(dist,v));
           adj.get(v).add(new pair(dist,u));
       }
       
       PriorityQueue<pair> minheap = new  PriorityQueue<>();
       int[] ways = new int[n];
       long[] dist = new long[n];
       Arrays.fill(dist,Long.MAX_VALUE);
       dist[0] = 0; ways[0] = 1;
       
       minheap.add(new pair(0,0));
       int mod = 1000000007;
       while(!minheap.isEmpty()){
           pair top = minheap.remove();
           long d = top.dist;
           int node = top.node;
           
           for(pair p:adj.get(node)){
               int adjnode = p.node;
               long dis = p.dist;
               
               if(d + dis < dist[adjnode]){
                   dist[adjnode] = d + dis;
                   minheap.add(new pair(d + dis,adjnode));
                   ways[adjnode] = ways[node];
               }
               else if(d + dis == dist[adjnode]){
                   ways[adjnode] = (ways[adjnode] +  ways[node]) % mod ;
               }
           }
       }
       
       return ways[n-1] % mod;
    }
}