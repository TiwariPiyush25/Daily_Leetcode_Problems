class Solution {
    public class triplet{
        int row;
        int col;
        int min;

        triplet(int r,int c,int m){
            this.row = r;
            this.col = c;
            this.min = m;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length; int n =grid[0].length;

        Queue<triplet> q = new LinkedList<>();
        // put all Rotten Oranges to the Queue
        int freshCnt = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new triplet(i,j,0));
                }
                if(grid[i][j] == 1) freshCnt++;
             }
        }

        int[] row = {-1,0,1,0};
        int[] col = {0,-1,0,1};
        int Totalmin = 0;
        // Rotten the Oranges
        while(!q.isEmpty()){
            triplet top = q.remove();

            for(int i = 0;i<4;i++){
                int newRow = top.row + row[i];
                int newCol = top.col + col[i];
            
                if(newRow >=0 && newCol>=0 && newRow<m && newCol<n && grid[newRow][newCol] == 1){
                    freshCnt--;
                    grid[newRow][newCol] = 2;
                    q.add(new triplet(newRow,newCol,top.min+1));
                    Totalmin = top.min+1;
                }
            }
        }

        return freshCnt > 0 ? -1 : Totalmin;
    }
}