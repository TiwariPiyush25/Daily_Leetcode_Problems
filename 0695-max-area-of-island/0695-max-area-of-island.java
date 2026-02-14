class Solution {
    public int maxArea , Area;
    public void dfs(int row,int col,int[][] grid,boolean[][] vis){
        vis[row][col] = true;

        int m = grid.length, n = grid[0].length;

        int[] Row = {-1,0,1,0};
        int[] Col = {0,-1,0,1};
        for(int i=0;i<4;i++){
            int newRow = row + Row[i];
            int newCol = col + Col[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !vis[newRow][newCol] && grid[newRow][newCol] == 1){
                Area++;
                dfs(newRow,newCol,grid,vis);
            }
        }

        maxArea = Math.max(maxArea,Area);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        maxArea = 0;

        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    Area = 1;
                    dfs(i,j,grid,vis);
                }
            }
        }

        return maxArea;
    }
}