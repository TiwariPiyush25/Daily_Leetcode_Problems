class Solution {
    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        minheap.add(new int[]{0,0,grid[0][0],k,2});
        
        int[][][][] cost = new int[m][n][k+1][3];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                for(int l = 0;l <= k;l++){
                    cost[i][j][l][0] = Integer.MAX_VALUE;
                    cost[i][j][l][1] = Integer.MAX_VALUE;
                    cost[i][j][l][2] = Integer.MAX_VALUE;
                }
            }
        }
        cost[0][0][k][2] = grid[0][0];
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!minheap.isEmpty()){
            int[] top = minheap.remove();
            int r = top[0], c = top[1], sum = top[2], turn = top[3],d = top[4];

            if(cost[r][c][turn][d] < sum) continue;

            if(r == m-1 && c == n-1) return sum;

            for(int i = 0;i < 4;i++){
                int nr = r + dir[i][0], nc = c + dir[i][1], nt = turn;

                if(nr < 0 || nc < 0 || nr >= m || nc >= n) continue;

                int nd = (i < 2) ? 0 : 1;
                
                if(d != 2 && nd != d){
                    if(nt == 0) continue;
                    nt--;
                }

                int newCost = sum + grid[nr][nc];

                if(cost[nr][nc][nt][nd] > newCost){
                    minheap.add(new int[]{nr,nc,newCost,nt,nd});
                    cost[nr][nc][nt][nd] = newCost;
                }
            }
        }

        return -1;
    }
}