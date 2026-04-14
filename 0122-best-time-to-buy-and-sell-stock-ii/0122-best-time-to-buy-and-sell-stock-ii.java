class Solution {
    public int helper(int i,int Canbuy,int[] arr,int[][] dp){
        if(i == arr.length) return 0;

        if(dp[i][Canbuy] != -1) return dp[i][Canbuy];
        int profit = 0;
        if(Canbuy == 1){
            int take = -arr[i] + helper(i+1,0,arr,dp);
            int nottake = helper(i+1,1,arr,dp);
            profit = Math.max(take,nottake);
        }
        else{
            int sell = arr[i] + helper(i+1,1,arr,dp);
            int notsell = helper(i+1,0,arr,dp);
            profit = Math.max(sell,notsell);
        }

        return dp[i][Canbuy]  = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] d:dp) Arrays.fill(d,-1);

        return helper(0,1,prices,dp);
    }
}