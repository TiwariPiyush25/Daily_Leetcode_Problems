class Solution {
    public void bfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            int front = q.remove();
            
            for(int ele : adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] inv : invocations){
            int u = inv[0] , v = inv[1];

            adj.get(u).add(v);
        }

        boolean[] suspicious = new boolean[n];
        bfs(k , adj, suspicious);

        boolean flag = false;
         for(int[] inv : invocations){
            int u = inv[0] , v = inv[1];

            if(!suspicious[u] && suspicious[v]) {
                flag = true;
                break;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(flag) ans.add(i);
            else if(!suspicious[i]) ans.add(i);
        }

        return ans;
    }
}