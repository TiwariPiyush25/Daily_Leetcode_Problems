class Solution {
    public class Triplet{
        int row;
        int col;
        int time;

        Triplet(int r,int c,int t){
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] vis = new int[m][n];
        int freshcnt = 0;

        Queue<Triplet> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new Triplet(i,j,0));
                    vis[i][j] = 2;
                }
                else {
                    vis[i][j] = 0;
                }

                if(grid[i][j] == 1) freshcnt++;
            }
        }

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};

        int maxTime = 0;
        while(!q.isEmpty()){
            Triplet top = q.remove();
            int r = top.row,c = top.col,t = top.time;
            maxTime = Math.max(maxTime,t);

            for(int i=0;i<4;i++){
                int newRow = r + row[i];
                int newCol = c + col[i];

                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && grid[newRow][newCol]==1 && vis[newRow][newCol] != 2){
                    vis[newRow][newCol] = 2;
                    q.add(new Triplet(newRow,newCol,t+1));
                    freshcnt--;
                }
            }
        }

        if(freshcnt > 0) return -1; 
        return maxTime;
    }
}