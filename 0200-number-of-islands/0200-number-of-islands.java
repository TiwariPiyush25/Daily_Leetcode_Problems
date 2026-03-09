class Solution {
    public boolean isValid(int newRow,int newCol,int m,int n,char[][] grid,boolean[][] vis){
        return newRow>=0 && newRow<m && newCol>=0 && newCol<n && 
              !vis[newRow][newCol] && grid[newRow][newCol] == '1';
    }
    public void dfs(int i,int j,char[][] grid,boolean[][] vis){
        int m = grid.length, n = grid[0].length;
        vis[i][j] = true;

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        for(int k=0;k<4;k++){
            int newRow = i + row[k];
            int newCol = j + col[k];

            if(isValid(newRow,newCol,m,n,grid,vis)){
                dfs(newRow,newCol,grid,vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    dfs(i,j,grid,vis);
                    islands++;
                }
            }
        }
        
        return islands;
    }
}