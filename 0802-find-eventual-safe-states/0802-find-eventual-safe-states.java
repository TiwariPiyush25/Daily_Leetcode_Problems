class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // reverse the graph
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>(); // adj of reverse graph
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        int[] indegree = new int[n];

        for(int i=0;i<n;i++){
            for(int src:graph[i]){
                // In original graph , edge is from i --> src
                // In reverse graph , edge is from src --> i
                adj.get(src).add(i);
                indegree[i]++;
            }
        }

        // Apply kahn's algorithm
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int temp = q.remove();
            ans.add(temp);
            for(int ele:adj.get(temp)){
                indegree[ele]--;

                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}