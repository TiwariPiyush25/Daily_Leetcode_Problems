class Solution {
    public int helper(int i,int n,int sum,int[][] dp){
        if(i == n || sum > n){
            if(sum == n){
                return 1;
            }
            return 0;
        }

        if(dp[i][sum] != -1) return dp[i][sum];
        int take = i * helper(i,n,sum + i,dp);
        int skip = helper(i+1,n,sum,dp);

        return dp[i][sum] = Math.max(take,skip);
    }
    public int integerBreak(int n) {
        int[][] dp = new int[n][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        
        return helper(1,n,0,dp);
    }
}