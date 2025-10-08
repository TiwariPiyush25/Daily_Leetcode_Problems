class Solution {
    public int paths(int sr,int sc,Integer er,Integer ec,int[][] dp){
        if (sr>=er || sc>=ec) return 0;
        if (sr==er-1 && sc==ec-1) return 1;

        if (dp[sr][sc]!=-1) return dp[sr][sc];

        int rightways=paths(sr,sc+1,er,ec,dp);
        int downways=paths(sr+1,sc,er,ec,dp);

        return dp[sr][sc]=rightways+downways;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++) {
                dp[i][j]=-1;
            }
        }
        return paths(0,0,m,n,dp);
    }
}