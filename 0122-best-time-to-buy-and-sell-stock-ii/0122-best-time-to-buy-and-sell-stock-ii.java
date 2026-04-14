class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        int[][] dp = new int[n+1][2];
        dp[n][0] = dp[n][1] = 0;

        for(int i=n-1;i>=0;i--){
            for(int Canbuy=0;Canbuy<=1;Canbuy++){
                int profit = 0;

                if(Canbuy == 1){
                    int take = -prices[i] + dp[i+1][0];
                    int nottake = dp[i+1][1];
                    profit = Math.max(take,nottake);
                }
                else{
                    int sell = prices[i] + dp[i+1][1];
                    int notsell = dp[i+1][0];
                    profit = Math.max(sell,notsell);
                }

                dp[i][Canbuy]  = profit;
            }
        }

        return dp[0][1];
    }
}