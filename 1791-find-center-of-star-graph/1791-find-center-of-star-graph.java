class Solution {
    public int findCenter(int[][] edges) {
        int[] Indegree = new int[edges.length+2];

        for(int[] edge:edges){
            int v1 = edge[0];
            int v2 = edge[1];
            Indegree[v1]++;
            Indegree[v2]++;
        }

        int maxIndegree = 0;
        int idx = -1;
        for(int i=1;i<Indegree.length;i++){
            if(Indegree[i] > maxIndegree){
                maxIndegree = Indegree[i];
                idx = i;
            }
        }

        return idx;
    }
}