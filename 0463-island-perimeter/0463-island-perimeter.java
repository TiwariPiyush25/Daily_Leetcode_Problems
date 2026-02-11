class Solution {
    public void dfs(int i,int j,int[][] grid,boolean[][] vis,int[] perimeter){
        int m = grid.length , n = grid[0].length;
        vis[i][j] = true;

        int sides = 4;
        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        for(int k=0;k<4;k++){
            int newRow = i + row[k];
            int newCol = j + col[k];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && grid[newRow][newCol]==1){
                if(!vis[newRow][newCol]) dfs(newRow,newCol,grid,vis,perimeter);
                sides--;
            }
        }

        perimeter[0] += sides;
    }
    public int islandPerimeter(int[][] grid) {
        int[] perimeter = new int[1];

        int m = grid.length , n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    dfs(i,j,grid,vis,perimeter);
                }
            }
        }

        return perimeter[0];
    }
}