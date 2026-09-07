class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length , n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int j = 0;j < n;j++) dp[0][j] = grid[0][j]; 
        
        for(int row = 1;row < m;row++){
            for(int col = 0;col < n;col++){
                int min = Integer.MAX_VALUE;
                for(int i = 0;i < n;i++){
                    if(i == col) continue;
                    min = Math.min(min , dp[row-1][i]);
                }

                dp[row][col] = min + grid[row][col];
            }
        }

        int minValue = Integer.MAX_VALUE;
        for(int j = 0;j < n;j++){
            minValue = Math.min(minValue , dp[m-1][j]);
        }

        return minValue;
    }
}