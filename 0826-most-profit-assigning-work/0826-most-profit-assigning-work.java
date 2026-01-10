class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int i = 0;
        int totalprofit = 0;
        while(i<worker.length){
            int currprofit = 0;
            for(int j = 0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]){
                    currprofit = Math.max(currprofit,profit[j]);
                }
            }

            totalprofit += currprofit;
            i++;
        }

        return totalprofit;
    }
}