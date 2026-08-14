class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};
        int[][] time = new int[m][n];
        for(int[] t : time) Arrays.fill(t , Integer.MAX_VALUE);

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        minheap.add(new int[]{0,0,grid[0][0]});
        time[0][0] = grid[0][0];

        while(!minheap.isEmpty()){
            int[] top = minheap.remove();
            int r = top[0], c = top[1], t = top[2];

            if(r == m-1 && c == n-1) return t;

            if(time[r][c] < t) continue;

            for(int i = 0;i < 4;i++){
                int nr = r + dir[i][0] , nc = c + dir[i][1];

                if(nr >= 0 && nr <= m-1 && nc >= 0 && nc <= n-1){
                    int nt = Math.max(t , grid[nr][nc]);

                    if(nt >= time[nr][nc]) continue;

                    minheap.add(new int[]{nr,nc,nt});
                    time[nr][nc] = nt;
                }
            }
        }

        return -1;
    }
}