class Solution {
    public class pair{
        int row;
        int col;

        pair(int r,int c){
            this.row = r;
            this.col = c;
        }
    }
    public void dfs(int i,int j,char[][] grid,boolean[][] vis){
        vis[i][j] = true;

        if(i>0 && !vis[i-1][j] &&  grid[i-1][j] == '1') dfs(i-1,j,grid,vis);
        if(i<grid.length-1 && !vis[i+1][j] &&  grid[i+1][j] == '1') dfs(i+1,j,grid,vis);
        if(j>0 && !vis[i][j-1] &&  grid[i][j-1] == '1') dfs(i,j-1,grid,vis);
        if(j<grid[0].length-1 && !vis[i][j+1] &&  grid[i][j+1] == '1') dfs(i,j+1,grid,vis);
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    vis[i][j] = true;
                    dfs(i,j,grid,vis);
                    count++;
                }
            }
        }

        return count;
    }
}