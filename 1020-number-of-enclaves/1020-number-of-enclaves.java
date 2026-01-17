class Solution {
    public void dfs(int i,int j,boolean[][] vis,int[][] board,int[] row,int[] col){
        int m = board.length;
        int n = board[0].length;
        vis[i][j] = true;

        // Check for Up, Left, Down, Right
        for(int k=0;k<4;k++){
            int newRow = row[k] + i;
            int newCol = col[k] + j;
            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !vis[newRow][newCol] && board[newRow][newCol] == 1){
                dfs(newRow,newCol,vis,board,row,col);
            }
        }

        
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        // traverse on the boundary
        // traverse on first & last row
        for(int j = 0;j<n;j++){
            // 1st row
            if(!vis[0][j] && grid[0][j] == 1){
                dfs(0,j,vis,grid,row,col);

            }

            // last row
            if(!vis[m-1][j] && grid[m-1][j] == 1){
                dfs(m-1,j,vis,grid,row,col);
            }
        }

        // traverse on first & last col
        for(int i = 0;i<m;i++){
            // 1st col
            if(!vis[i][0] && grid[i][0] == 1){
                dfs(i,0,vis,grid,row,col);

            }

            // last col
            if(!vis[i][n-1] && grid[i][n-1] == 1){
                dfs(i,n-1,vis,grid,row,col);
            }
        }

        // convert 1's
        int count =  0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    count++;
                }
            }
        }

        return count;
    }
}