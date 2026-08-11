class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> adjIn = new ArrayList<>();

        for(int i = 0;i < n;i++){
            adjIn.add(new ArrayList<>());
        }

        for(List<Integer> edge : edges){
            int u = edge.get(0),v  = edge.get(1);

            adjIn.get(v).add(u);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(adjIn.get(i).size() == 0) ans.add(i);
        }

        return ans;
    }
}