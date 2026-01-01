class Solution {
    static boolean ans;
    public void bfs(int i,int[][] adj,int[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        // Color new component...
        vis[i] = 0; // 1 --> Red && 0 --> Blue
        while(!q.isEmpty()){
            int temp = q.remove();

            int color = vis[temp];
            for(int ele:adj[temp]){
                if(vis[ele] == vis[temp]){
                    ans = false;
                    return;
                }

                if(vis[ele]==-1){
                    q.add(ele);
                    vis[ele] = 1 - color;
                }
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        ans = true;
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                if(ans == false) return ans;
                bfs(i,graph,visited);
            }
        }

        return ans;
    }
}