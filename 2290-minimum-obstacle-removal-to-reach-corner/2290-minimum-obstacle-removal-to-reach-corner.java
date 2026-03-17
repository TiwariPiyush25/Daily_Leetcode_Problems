class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        int[][] Obstacles = new int[m][n];
        
        for(int[] row:Obstacles){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int[] top = q.remove();
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
                        q.add(new int[]{nr,nc,totalObs});
                    }
                }
            }
        }
        return Obstacles[m-1][n-1];
    }
}