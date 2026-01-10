class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] arr = new int[difficulty.length][2];
        for(int i=0;i<difficulty.length;i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr,(a,b) -> a[1]-b[1]);

        int i = 0;
        int totalprofit = 0;
        while(i<worker.length){
            int currprofit = 0;
            int j = arr.length-1;
            while(j>=0){
                if(worker[i] >= arr[j][0] && currprofit < arr[j][1]){
                    currprofit = arr[j][1];
                    break;
                }
                j--;
            }

            totalprofit += currprofit;
            i++;
        }

        return totalprofit;
    }
}