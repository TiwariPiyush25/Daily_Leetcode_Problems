class Solution {
    public static boolean flag;
    public void dfs(int i,List<List<Integer>> adj,boolean[] vis,boolean[] path){
        vis[i] = true;
        path[i] = true;

        for(int ele:adj.get(i)){
            if(path[ele]==true){
                flag = false;
                return;
            }
            if(!vis[ele]) dfs(ele,adj,vis,path);
        }

        path[i] = false;
    }
    public boolean canFinish(int n, int[][] pre) {
        flag = true; // No cycle...
        List<List<Integer>> adj = new ArrayList<>();

        // create adj List
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] arr:pre){
            int dest = arr[0];
            int src = arr[1];
            // edge from src --> dest
            adj.get(src).add(dest);
        }

        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        
        for(int i=0;i<n;i++) {
            if(!vis[i]) dfs(i,adj,vis,path);
        }
        return flag;
    }
}