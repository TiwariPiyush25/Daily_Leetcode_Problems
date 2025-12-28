class Solution {
    public void bfs(int i,boolean[] vis,int[][] adj){
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while (q.size() > 0){
            int temp = q.remove();

            for (int j=0;j<adj.length;j++){
                if (!vis[j] && adj[temp][j]==1) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;

        boolean[] vis = new boolean[n];
        for (int i = 0;i<n;i++){
            if (!vis[i]) {
                bfs(i,vis,adj);
                count++;
            }
        }

        return count;
    }
}