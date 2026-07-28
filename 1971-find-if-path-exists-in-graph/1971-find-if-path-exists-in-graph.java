class Solution {
    public void dfs(int i,List<List<Integer>> adj,boolean[] vis,int end){
        vis[i] = true;

        for(int node : adj.get(i)){
            if(!vis[node]){
                dfs(node,adj,vis,end);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
       boolean[] vis = new boolean[n];

       List<List<Integer>> adj = new ArrayList<>();
       for(int i=0;i<n;i++) adj.add(new ArrayList<>());

       for(int[] arr:edges){
            int v1 = arr[0];
            int v2 = arr[1];

            adj.get(v1).add(v2); // v1 se v2 ka connection
            adj.get(v2).add(v1); // v2 se v1 ka connection
       }

       vis[start] = true;
       dfs(start,adj,vis,end);

       return vis[end]; // path exists
    }
}