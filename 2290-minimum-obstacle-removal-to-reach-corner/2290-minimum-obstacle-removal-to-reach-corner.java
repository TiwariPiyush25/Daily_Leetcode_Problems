class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        int[][] Obstacles = new int[m][n];
        
        for(int[] row:Obstacles){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){
            int[] top = pq.remove();
            int r = top[0], c = top[1], Obs = top[2];

            if(Obs > Obstacles[r][c]) continue;

            for(int i=0;i<4;i++){
                int nr = r + row[i], nc = c + col[i];

                if(nr>=0 && nr<m && nc>=0 && nc<n){
                    int totalObs = Obs;
                    if(grid[nr][nc] == 1){
                        totalObs += 1;
                    }
                    if(totalObs < Obstacles[nr][nc]){
                        Obstacles[nr][nc] = totalObs;
                        pq.add(new int[]{nr,nc,totalObs});
                    }
                }
            }
        }
        return Obstacles[m-1][n-1];
    }
}