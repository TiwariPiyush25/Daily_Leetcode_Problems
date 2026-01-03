class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];
        boolean[] vis = new boolean[n];

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] arr:pre){
            int dest = arr[0];
            int src = arr[1];
            // edge from src --> dest
            indegree[dest]++;
            adj.get(src).add(dest);
        }
        
        // kahn's algorithm
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0) {
                q.add(i);
                vis[i] = true;
            }
        }

        while(!q.isEmpty()){
            int temp = q.remove();
            ans.add(temp);

            for(int ele:adj.get(temp)){
                indegree[ele]--;

                if(indegree[ele]==0){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

        return ans.size() == n;
    }
}