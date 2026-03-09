class Solution {
    public void bfs(int i,int[][] isConnected,boolean[] vis){
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        
        while(!q.isEmpty()){
            int top = q.remove();

            for(int j=0;j<isConnected.length;j++){
                if(!vis[j] && isConnected[top][j] == 1){
                    vis[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];

        int count = 0; // count provinces
        for(int i=0;i<n;i++){
            if(!vis[i]) {
                bfs(i,isConnected,vis);
                count++;
            }
        }

        return count;
    }
}