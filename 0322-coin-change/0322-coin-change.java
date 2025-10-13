class Solution {
    public long coincount(int[] arr,int amount,int i,long[][] dp){
        if (i==arr.length){
            if (amount==0) return 0; //  no more coins needed
            else return Integer.MAX_VALUE; //  not a valid Combination
        }

        if (dp[i][amount]!=-1) return dp[i][amount];
        long skip = coincount(arr,amount,i+1,dp) ;
        if (amount-arr[i]<0) return dp[i][amount] = skip;
        long pick = 1 + coincount(arr,amount-arr[i],i,dp); // no. of coins

        return dp[i][amount] = Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        // i = 0  to n-1 | amount = amount to 0
        int n=coins.length;
        long[][] dp=new long[n][amount+1];
        for (int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        int ans=(int) coincount(coins,amount,0,dp);

        if (ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}