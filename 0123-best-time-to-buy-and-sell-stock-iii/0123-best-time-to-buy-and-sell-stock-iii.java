class Solution {
    public int helper(int i,int CanBuy,int Cap,int[] arr,int[][][] dp){
        if(i == arr.length || Cap == 0) return 0;
        
        if(dp[i][CanBuy][Cap] != -1) return dp[i][CanBuy][Cap];
        int profit = 0;

        if(CanBuy == 1){
            int buy = -arr[i] + helper(i+1,0,Cap,arr,dp);
            int notbuy  = helper(i+1,1,Cap,arr,dp);
            profit =  Math.max(buy,notbuy);
        }
        else {
            int sell = arr[i] + helper(i+1,1,Cap-1,arr,dp);
            int notsell  = helper(i+1,0,Cap,arr,dp);
            profit = Math.max(sell,notsell); 
        }

        return dp[i][CanBuy][Cap] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        for(int[][] arr:dp){
            for(int[] d:arr) Arrays.fill(d,-1);
        }

        return helper(0,1,2,prices,dp);
    }
}