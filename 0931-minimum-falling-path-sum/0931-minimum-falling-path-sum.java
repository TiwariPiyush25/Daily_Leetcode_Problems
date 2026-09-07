class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length , n = matrix[0].length;

        int[][] dp = new int[m][n];
        for(int j = 0;j < n;j++){
            dp[0][j] = matrix[0][j]; 
        }

        for(int row = 1;row < m;row++){
            for(int col = 0;col < n;col++){
                int minValue = Integer.MIN_VALUE;
                if(col == 0){
                    minValue = Math.min(dp[row-1][col],dp[row-1][col+1]);
                }
                else if(col == n - 1){
                    minValue = Math.min(dp[row-1][col],dp[row-1][col-1]);
                }
                else {
                    minValue = Math.min(dp[row-1][col],Math.min(dp[row-1][col-1],dp[row-1][col+1]));
                }

                dp[row][col] = minValue + matrix[row][col];
            }
        }

        int minValue = Integer.MAX_VALUE;
        for(int j = 0;j < n;j++){
            minValue = Math.min(minValue , dp[m-1][j]);
        }

        return minValue;
    }
}