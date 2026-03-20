class Solution {
    public long helper(int n,int[] costs,long[] dp){
        if(n < 0) return Long.MAX_VALUE;

        if(dp[n] != -1) return dp[n];
        long onestep = (costs[n] + 1) + helper(n-1,costs,dp);
        long twostep = (costs[n] + 4) +  helper(n-2,costs,dp);
        long threestep = (costs[n] + 9) + helper(n-3,costs,dp);

        return dp[n] = Math.min(onestep,Math.min(twostep,threestep));
    }
    public int climbStairs(int n, int[] costs) {
        int[] cost = new int[n+1];
        for(int i=1;i<=n;i++) cost[i] = costs[i-1];

        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        return (int) helper(n,cost,dp);
    }
}