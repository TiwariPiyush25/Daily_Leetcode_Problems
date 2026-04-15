class Solution {
    public int maxProfit(int[] arr) {
        int[][] after = new int[2][3];
        int[][] curr = new int[2][3];

        for (int i = arr.length-1; i>=0; i--) {
            for (int CanBuy = 0; CanBuy <= 1; CanBuy++) {
                for (int Cap = 1; Cap <= 2; Cap++) {
                    int profit = 0;
                    if (CanBuy == 1) {
                        int buy = -arr[i] + after[0][Cap];
                        int notbuy = after[1][Cap];
                        profit = Math.max(buy, notbuy);
                    } else {
                        int sell = arr[i] + after[1][Cap-1];
                        int notsell = after[0][Cap];
                        profit = Math.max(sell, notsell);
                    }

                    curr[CanBuy][Cap] = profit;
                }
            }

            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    after[j][k] = curr[j][k];
                }
            }
        }

        return after[1][2];
    }
}