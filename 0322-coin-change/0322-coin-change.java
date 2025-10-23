class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long[][] dp=new long[2][amount+1];

        for (int i=0;i<n;i++){
            for (int j=0;j<dp[0].length;j++){
                long skip = (i>0) ? dp[0][j] : (j==0) ? 0 : Integer.MAX_VALUE;
                if (j-coins[i]<0) dp[1][j] = skip;
                else {
                    long pick = 1 + dp[1][j - coins[i]];
                    dp[1][j] = Math.min(skip,pick);
                }
            }

            // copy 1st row in 0th row
            for(int j=0;j<dp[0].length;j++){
                dp[0][j] = dp[1][j];
            }
        }
        int ans=(int) dp[1][amount];
        if (ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}