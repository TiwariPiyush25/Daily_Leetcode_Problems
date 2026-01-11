class Solution {
    public int findTheCity(int n, int[][] edges, int threshold) {
        int[][] dist = new int[n][n];
        for(int[] arr:dist) Arrays.fill(arr,Integer.MAX_VALUE);
        for(int[] edge:edges){
            int v1 = edge[0], v2 = edge[1], wt = edge[2];

            dist[v1][v2] = wt;
            dist[v2][v1] = wt;
        }
        
        // Floyd Warshall
        for(int C = 0;C < n; C++){
            // A to B through C
            for(int A = 0;A < n; A++){ // Node A
                if(A==C) continue;
                for(int B = 0;B < n;B++){ // Node B
                    if(B==C) continue;
                    if(dist[A][C]==Integer.MAX_VALUE || dist[C][B]==Integer.MAX_VALUE )  continue;
                    dist[A][B] = Math.min(dist[A][B],dist[A][C]+dist[C][B]);
                }
            }
        }

        int minCity = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i!=j && dist[i][j] <= threshold) count++;
            }

            if(count <= min){
                min = count;
                minCity = i;
            }
        }

        return minCity;
    }
}