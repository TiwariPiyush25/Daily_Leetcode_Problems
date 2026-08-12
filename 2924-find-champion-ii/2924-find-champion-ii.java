class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];
        int unique  = n;
        for(int[] edge : edges){
            int a = edge[0], b = edge[1];

            if(indegree[b] == 0) unique--;
            indegree[b]++;
        }

        for(int i = 0;i < n;i++){
            if(unique == 1 && indegree[i] == 0) return i;
        }

        return -1;
    }
}