class Solution {
    public long helper(int i,int n,int[] cost,long[] dp) {
        if(i == n) return 0;
        if(dp[i] != -1) return dp[i];

        long oneStep = Long.MAX_VALUE;
        if(i + 1 <= n) oneStep = cost[i] + 1L + helper(i + 1 ,n ,cost ,dp);
        long twoStep = Long.MAX_VALUE;
        if(i + 2 <= n) twoStep = cost[i + 1] + 4L + helper(i + 2 ,n ,cost ,dp);
        long threeStep = Long.MAX_VALUE;
        if(i + 3 <= n) threeStep = cost[i + 2]+ 9L + helper(i + 3 ,n,cost ,dp);

        return dp[i] = Math.min(oneStep , Math.min(twoStep , threeStep));
    }
    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 2];
        Arrays.fill(dp , -1L);
        return (int) helper(0,n,costs,dp);
    }
}