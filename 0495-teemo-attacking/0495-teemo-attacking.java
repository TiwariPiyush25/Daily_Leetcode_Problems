class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int stTime = timeSeries[0];
        int endTime = timeSeries[0] + duration - 1;

        for(int i = 1;i < timeSeries.length;i++){
            int currTime = timeSeries[i];

            if(currTime <= endTime){
                total += (currTime - stTime);
            }
            else {
                total += (endTime - stTime + 1);
            }
            // updateTime 
            stTime = currTime;
            endTime = currTime + duration - 1;
        }
        total += (endTime - stTime + 1);

        return total;
    }
}