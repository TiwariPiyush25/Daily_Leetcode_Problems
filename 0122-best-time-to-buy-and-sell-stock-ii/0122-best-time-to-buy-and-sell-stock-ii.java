class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[] next = new int[2];
        int[] curr = new int[2];

        next[0] = next[1] = 0;

        for(int i=n-1;i>=0;i--){
            for(int Canbuy=0;Canbuy<=1;Canbuy++){
                int profit = 0;

                if(Canbuy == 1){
                    int take = -prices[i] + next[0];
                    int nottake =  next[1];
                    profit = Math.max(take,nottake);
                }
                else{
                    int sell = prices[i] + next[1];
                    int notsell = next[0];
                    profit = Math.max(sell,notsell);
                }

                curr[Canbuy]  = profit;
            }

            next[0] = curr[0];
            next[1] = curr[1];
        }

        return next[1];
    }
}