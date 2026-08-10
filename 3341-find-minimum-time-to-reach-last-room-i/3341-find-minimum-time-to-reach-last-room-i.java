class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length , n = moveTime[0].length;

        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};

        int[][] Time = new int[m][n];
        for(int[] t : Time) Arrays.fill(t,Integer.MAX_VALUE);

        PriorityQueue<int[]> minheap = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        Time[0][0] = 0;
        minheap.add(new int[]{0,0,0});

        while(!minheap.isEmpty()){
            int[] top = minheap.remove();
            int r = top[0], c = top[1], t = top[2];

            if(r == m-1 && c == n-1) return t;

            if(Time[r][c] < t) continue;

            for(int i = 0;i < 4;i++){
                int nr = r + dir[i][0], nc = c + dir[i][1];

                if(nr >= 0 && nr <= m-1 && nc >= 0 && nc <= n-1){
                    int nt = Math.max(t , moveTime[nr][nc]) + 1;
                    if(nt >= Time[nr][nc]) continue;

                    minheap.add(new int[]{nr,nc,nt});
                    Time[nr][nc] = nt;
                }
            }
        }

        return -1;
    }
}