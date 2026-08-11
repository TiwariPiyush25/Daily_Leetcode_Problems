class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // kitni call lagani padegi ye 
        List<List<Integer>> adjOut = new ArrayList<>();
        List<List<Integer>> adjIn = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adjIn.add(new ArrayList<>());
            adjOut.add(new ArrayList<>());
        }

        for(List<Integer> edge : edges){
            int u = edge.get(0),v  = edge.get(1);

            adjOut.get(u).add(v);
            adjIn.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        List<Integer> ans = new ArrayList<>();

        int notvis = n;

        for(int i = 0;i < n;i++){
            if(notvis == 0) break;

            if(!vis[i] && adjIn.get(i).size() == 0){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);

                while(!q.isEmpty()){
                    int node = q.remove();

                    for(int x : adjOut.get(node)){
                        if(!vis[x]){
                            vis[x] = true;
                            notvis--;

                            q.add(x);
                        }
                    }
                }

                vis[i] = true;
                ans.add(i);
                notvis--;
            }
        }

        return ans;
    }
}