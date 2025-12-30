class Solution {
    public void dfs(int i,List<List<Integer>> adj,boolean[] vis){
        int size = adj.get(i).size();
        vis[i] = true;

        for(int ele:adj.get(i)){
            if(!vis[ele]){
                dfs(ele,adj,vis);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];

        vis[0] = true;
        dfs(0,adj,vis);
        for(boolean ele:vis) if(!ele) return ele;
        return true;
    }
}