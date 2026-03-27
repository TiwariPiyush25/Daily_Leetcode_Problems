class Solution {
    public int mod = 1000000007;
    public int helper(int i,int sum,int n,int x,int[][] dp){
        if(sum == n) return 1;
        if(i > n || sum > n || sum < 0){
            return 0;
        }
        if(dp[i][sum] != -1) return dp[i][sum];
        int take = helper(i+1,sum + ((int)Math.pow(i,x)),n,x,dp);
        int skip = helper(i+1,sum,n,x,dp);

        return dp[i][sum] = ((take + skip) % mod);
    }
    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n+1][n+1];
        for(int[] d:dp) Arrays.fill(d,-1);

        return helper(1,0,n,x,dp);
    }
}