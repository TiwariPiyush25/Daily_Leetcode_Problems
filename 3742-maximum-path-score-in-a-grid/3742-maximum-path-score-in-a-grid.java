class Solution {
    public int helper(int r,int c,int cost,int[][] grid,int k,int[][][] dp){
        int m = grid.length, n = grid[0].length;
        if(r >= m || c >= n) return Integer.MIN_VALUE;

        int currCost = (grid[r][c] == 0) ? 0 : 1;
        int newCost = cost + currCost;
        
        if(newCost > k) return Integer.MIN_VALUE;
        if(r == m - 1 && c == n - 1) return grid[r][c];
        
        if(dp[r][c][newCost] != -1) return dp[r][c][newCost];

        int down = helper(r + 1, c, newCost, grid,k , dp);
        int right = helper(r , c + 1, newCost, grid,k , dp);

        int max = Math.max(down , right);

        if(max == Integer.MIN_VALUE) dp[r][c][newCost] = Integer.MIN_VALUE;
        return dp[r][c][newCost] = grid[r][c] + max;
    }
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        int[][][] dp = new int[m][n][k+1];
        for(int[][] dx : dp){
            for(int[] d : dx) Arrays.fill(d , -1);
        }

        int ans = helper(0,0,0,grid,k,dp);
        return ans < 0 ? -1 : ans;
    }
}