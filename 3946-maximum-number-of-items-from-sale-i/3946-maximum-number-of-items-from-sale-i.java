class Solution {
    public int helper(int i,int budget, int[] Copies,int[][] items,int minP,int[][] dp){
        if(i == items.length) return  budget / minP;
        
        if(dp[i][budget] != -1) return dp[i][budget];

        int skip = helper(i+1,budget,Copies,items,minP,dp);
        int take = 0;
        if(budget >= items[i][1]){
            take = (1 + Copies[i]) + helper(i+1,budget - items[i][1],Copies,items,minP,dp);
        }

        return dp[i][budget] = Math.max(take,skip);
    }
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE; 

        int[] freeCopies = new int[n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i != j && items[j][0] % items[i][0] == 0){
                    freeCopies[i]++;
                }
            }

            minPrice = Math.min(minPrice , items[i][1]);
        }

        int[][] dp = new int[n][budget+1];
        for(int[] d:dp) Arrays.fill(d,-1);

        return helper(0 ,budget, freeCopies ,items ,minPrice ,dp); 
    }
}