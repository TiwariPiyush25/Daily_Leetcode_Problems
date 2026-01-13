class Solution {
    public int[] parent,size;
    public boolean[] parity;
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
                parity[v] = !parity[u];
            }
            else{
                parent[a] = b;
                size[b] += size[a];
                parity[u] = !parity[v];
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        parent = new int[n];
        size = new int[n];
        parity = new boolean[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }

        for(int i =0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                if(graph[i][j] >  i){
                    if(leader(i) == leader(graph[i][j]) && parity[i] == parity[graph[i][j]]) return false;
                    else union(i,graph[i][j]);
                }
            }
        }

        return true;
    }
}