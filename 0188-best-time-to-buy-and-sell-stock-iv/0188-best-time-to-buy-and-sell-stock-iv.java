class Solution {
    public int maxProfit(int k, int[] arr) {
        int[][][] dp = new int[arr.length+1][2][k+1];

        for (int i = arr.length-1; i>=0; i--) {
            for (int CanBuy = 0; CanBuy <= 1; CanBuy++) {
                for (int Cap = 1; Cap <= k; Cap++) {
                    int profit = 0;
                    if (CanBuy == 1) {
                        int buy = -arr[i] + dp[i+1][0][Cap];
                        int notbuy = dp[i+1][1][Cap];
                        profit = Math.max(buy, notbuy);
                    } else {
                        int sell = arr[i] + dp[i+1][1][Cap-1];
                        int notsell = dp[i+1][0][Cap];
                        profit = Math.max(sell, notsell);
                    }

                    dp[i][CanBuy][Cap] = profit;
                }
            }
        }

        return dp[0][1][k];
    }
}