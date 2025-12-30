class Solution {
    public void dfs(int i,boolean[] vis,int[][] adj){
        int n  = adj.length;
        vis[i] = true;

        for(int j = 0;j<n;j++){
            if(adj[i][j] == 1 && !vis[j]){
                dfs(j,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;

        boolean[] vis = new boolean[n];
        for (int i = 0;i<n;i++){
            if (!vis[i]) {
                dfs(i,vis,adj);
                count++;
            }
        }

        return count;
    }
}