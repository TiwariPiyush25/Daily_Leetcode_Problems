class Solution {
    public void bfs(int i,List<List<Integer>> adj,boolean[] vis){
        int size = adj.get(i).size();
        Queue<Integer> Q = new LinkedList<>();
        Q.add(i);

        while(!Q.isEmpty()){
            int temp = Q.remove();

            for(int ele:adj.get(temp)){
                if(!vis[ele]){
                    vis[ele] = true;
                    Q.add(ele);
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];

        vis[0] = true;
        bfs(0,adj,vis);
        for(boolean ele:vis) if(!ele) return ele;
        return true;
    }
}