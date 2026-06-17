class Solution {
    public int mod = 1000000007;
    public int helper(int i,int j,int sum,int[][] grid,int k,int[][][] dp){
        int m = grid.length, n = grid[0].length;
        if(i == m-1 && j == n-1 && (sum + grid[i][j]) % k == 0) return 1;
        if(i > m-1 || j > n-1) return 0;
        
        sum += grid[i][j];
        if(dp[i][j][sum%k] != -1) return dp[i][j][sum%k];
        int rightPath = helper(i , j + 1, sum, grid, k, dp);
        int downPath = helper(i + 1, j, sum, grid, k, dp);

        return dp[i][j][sum%k] = (rightPath + downPath) % mod;
    }
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][k]; 

        for(int[][] arr:dp){
            for(int[] a:arr){
                Arrays.fill(a,-1);
            }
        }

        return helper(0,0,0,grid,k,dp);
    }
}