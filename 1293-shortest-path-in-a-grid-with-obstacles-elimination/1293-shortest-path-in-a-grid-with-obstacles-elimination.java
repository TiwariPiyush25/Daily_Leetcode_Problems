class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        int[][] dist = new int[m][n];
        for(int[] row : dist) Arrays.fill(row, -1);

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0,k});

        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};

        dist[0][0] = k;

        while(!q.isEmpty()){
            int[] top = q.remove();

            if(top[0] == m-1 && top[1] == n-1) return top[2];

            for(int j = 0; j < 4; j++){
                int nr = r[j] + top[0];
                int nc = c[j] + top[1];

                if(nr>=0 && nr<m && nc>=0 && nc<n){
                    int x = top[3] - grid[nr][nc];
                    if(x >= 0 && dist[nr][nc] < x){
                        dist[nr][nc] = x;

                        q.add(new int[]{nr, nc, top[2]+1, x});
                    }
                }
            } 
        }

        return -1;
    }
}