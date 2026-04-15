class Solution {
    public int helper(int i,int transection,int[] arr,int[][]dp){
        if(i == arr.length || transection == 4) return 0;
        
        if(dp[i][transection] != -1) return dp[i][transection];
        if(transection % 2 == 0){
            int buy = -arr[i] + helper(i+1,transection+1,arr,dp);
            int notbuy  = helper(i+1,transection,arr,dp);
            return dp[i][transection] =  Math.max(buy,notbuy);
        }
        else {
            int sell = arr[i] + helper(i+1,transection+1,arr,dp);
            int notsell  = helper(i+1,transection,arr,dp);
            return dp[i][transection] = Math.max(sell,notsell); 
        }
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][4];
        for(int[] d:dp) Arrays.fill(d,-1);

        return helper(0,0,prices,dp);
    }
}