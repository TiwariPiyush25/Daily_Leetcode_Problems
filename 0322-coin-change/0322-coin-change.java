class Solution {
    public long helper(int i,int[] arr,int tar,long[][] dp){
        if(i == arr.length){
            if(tar == 0) return 0;
            return Integer.MAX_VALUE;
        }

        if(dp[i][tar] != -1) return dp[i][tar];

        long skip = helper(i+1,arr,tar,dp);
        if(tar - arr[i] < 0) return skip;
        long take = 1 + helper(i,arr,tar - arr[i],dp);

        return dp[i][tar] = Math.min(take , skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        long[][] dp = new long[n][amount+1];
        for(long[] d : dp) Arrays.fill(d,-1);
        int ans = (int) helper(0,coins,amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}