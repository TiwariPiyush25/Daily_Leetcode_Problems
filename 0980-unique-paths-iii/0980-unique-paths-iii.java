class Solution {
    public int paths(int[][] mat,int sr,int sc,int er,int ec,boolean[][] vis,int remaining){
        if(sr < 0 || sr >= mat.length || sc < 0 || sc >= mat[0].length || mat[sr][sc] == -1 || vis[sr][sc]){
            return 0;
        }
        if(sr == er && sc == ec) return remaining == 1 ? 1 : 0;

        vis[sr][sc] = true;

        int leftWays = paths(mat,sr,sc-1,er,ec,vis,remaining-1);
        int rightWays = paths(mat,sr,sc+1,er,ec,vis,remaining-1);
        int downWays = paths(mat,sr+1,sc,er,ec,vis,remaining-1);
        int upWays = paths(mat,sr-1,sc,er,ec,vis,remaining-1);

        vis[sr][sc] = false;
        return leftWays + rightWays + downWays + upWays;
    }
    public int uniquePathsIII(int[][] grid) {
        int sr = 0, sc = 0;
        int er = 0, ec = 0;
        int totalObs = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
                else if(grid[i][j] == 2){
                    er = i;
                    ec = j;
                }

                if(grid[i][j] != -1) totalObs++;
            }
        }
        boolean[][] vis = new boolean[m][n];

        return paths(grid,sr,sc,er,ec,vis,totalObs);
    }
}