class Solution {
    public int edgeScore(int[] edges) {
        long[] score = new long[edges.length];
        
        long maxScore = -1;
        int idx = -1;
        for(int v = 0;v < edges.length;v++){
            int u = edges[v];

            score[u] += v;
        }

        for(int v = 0;v < score.length;v++){
            if(score[v] > maxScore){
                maxScore = score[v];
                idx = v;
            }
        }

        return idx;
    }
}