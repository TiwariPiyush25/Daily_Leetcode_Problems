class Solution {
    private int timer = 1;
    public void dfs(int node,int parent,int[] vis,List<List<Integer>> adj,int[] tin,int[] low,List<List<Integer>> Bridges){
        vis[node] = 1;
        tin[node] = low[node] = timer;
        timer++;

        for(int it : adj.get(node)){
            if(it == parent) continue;
            if(vis[it] == 0){
                dfs(it,node,vis,adj,tin,low,Bridges);
                low[node] = Math.min(low[node],low[it]);

                // there is a Bridge
                if(low[it] > tin[node]){
                    Bridges.add(Arrays.asList(it,node));
                }
            }
            else {
                low[node] = Math.min(low[node],low[it]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(List<Integer> it : connections){
            int u = it.get(0) , v = it.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[n];
        int[] tin = new int[n];  // time of insertion
        int[] low = new int[n];

        List<List<Integer>> Bridges = new ArrayList<>();
        dfs(0,-1,vis,adj,tin,low,Bridges);
        return Bridges;
    }
}