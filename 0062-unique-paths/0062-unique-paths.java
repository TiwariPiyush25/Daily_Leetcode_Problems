class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[2][n];
        for (int j=0;j<n;j++){
            dp[0][j]=1;
            dp[1][j]=1;
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[1][j] = dp[1][j-1] + dp[0][j];

                dp[0][j]=dp[1][j]; // copy the 1st row in 0th row
            }
        }

        return dp[1][n-1];
    }
}