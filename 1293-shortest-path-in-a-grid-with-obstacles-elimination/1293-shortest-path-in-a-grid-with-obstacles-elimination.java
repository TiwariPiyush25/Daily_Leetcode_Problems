class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        boolean[][][] vis = new boolean[m+1][n+1][k+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,k});

        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};

        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] top = q.remove();

                if(top[0] == m-1 && top[1] == n-1) return steps;

                for(int j = 0; j < 4; j++){
                    int nr = r[j] + top[0];
                    int nc = c[j] + top[1];

                    if(nr>=0 && nr<m && nc>=0 && nc<n){
                        if(grid[nr][nc] == 0 && !vis[nr][nc][top[2]]){
                            q.add(new int[]{nr,nc,top[2]});
                            vis[nr][nc][top[2]] = true;
                        }
                        else if(grid[nr][nc] == 1 && top[2] > 0 && !vis[nr][nc][top[2]-1]){
                            q.add(new int[]{nr,nc,top[2]-1});
                            vis[nr][nc][top[2]-1] = true;
                        }
                    }
                } 
            }

            steps++;
        }

        return -1;
    }
}