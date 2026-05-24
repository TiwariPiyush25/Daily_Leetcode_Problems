class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] Indegree = new int[n + 1];
        int[] Outdegree = new int[n + 1];
        Indegree[0] = -1; Outdegree[0] = -1;
        for(int[] t:trust){
            Indegree[t[1]]++;
            Outdegree[t[0]]++;
        }

        for(int i = 0 ;i < Indegree.length;i++){
           if(Indegree[i] == n - 1 && Outdegree[i] == 0) return i;
        }

        return -1;
    }
}