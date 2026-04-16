class Solution {
    public int helper(int i,int CanBuy,int fee ,int[] arr,int[][] dp){
        if(i >= arr.length) return 0;

        if(dp[i][CanBuy] != -1) return dp[i][CanBuy];
        if(CanBuy == 1){
            int buy = -arr[i] + helper(i+1,0,fee,arr,dp);
            int notbuy = helper(i+1,1,fee,arr,dp);
            return dp[i][CanBuy] = Math.max(buy,notbuy);
        }
        else {
            int sell = (arr[i] - fee)+ helper(i+1,1,fee,arr,dp);
            int notsell = helper(i+1,0,fee,arr,dp);
            return dp[i][CanBuy] = Math.max(sell,notsell);
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] d:dp) Arrays.fill(d,-1);
        return helper(0,1,fee,prices,dp);
    }
}