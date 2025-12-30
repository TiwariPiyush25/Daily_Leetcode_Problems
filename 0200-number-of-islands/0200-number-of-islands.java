class Solution {
    public class pair{
        int row;
        int col;

        pair(int r,int c){
            this.row = r;
            this.col = c;
        }
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] vis){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));

        while(!q.isEmpty()){
            pair p = q.remove();
            int r = p.row;
            int c = p.col;

            if(r<grid.length-1 && !vis[r+1][c] &&  grid[r+1][c] == '1'){
                vis[r+1][c] = true;
                q.add(new pair(r+1,c));
            }
            if(c<grid[0].length-1 && !vis[r][c+1] && grid[r][c+1] == '1'){
                vis[r][c+1] = true;
                q.add(new pair(r,c+1));
            }
        }
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
                    bfs(i,j,grid,vis);
                    count++;
                }
            }
        }

        return count;
    }
}