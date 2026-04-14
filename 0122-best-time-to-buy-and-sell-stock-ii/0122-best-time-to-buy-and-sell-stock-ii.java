class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int nextNotBuy = 0,  nextBuy = 0;
        int currNotBuy = 0, currBuy = 0;

        for(int i=n-1;i>=0;i--){
            currNotBuy = Math.max(prices[i] + currBuy,currNotBuy);
            currBuy = Math.max(-prices[i] + currNotBuy,currBuy);


            nextNotBuy = currNotBuy;
            nextBuy = currBuy;
        }

        return nextBuy;
    }
}