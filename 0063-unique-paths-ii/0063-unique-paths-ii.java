class Solution {
    public int paths(int[][] grid,int sr,int sc,int er,int ec,int[][] dp){
        if(sr>=er || sc>=ec || grid[sr][sc]==1) return 0; 
        if(sr==er-1 && sc==ec-1) return 1;

        if(dp[sr][sc]!=-1) return dp[sr][sc];
        int rightways=paths(grid,sr,sc+1,er,ec,dp);
        int downways=paths(grid,sr+1,sc,er,ec,dp);

        return dp[sr][sc] = rightways + downways;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return paths(obstacleGrid,0,0,m,n,dp);
    }
}