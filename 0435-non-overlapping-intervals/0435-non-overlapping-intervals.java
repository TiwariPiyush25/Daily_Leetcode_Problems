class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);

        int count = 0;
        int[] previnterval = new int[2];
        previnterval[0] = intervals[0][0];
        previnterval[1] = intervals[0][1];

        for(int i = 1;i<intervals.length;i++){
            if(previnterval[1] > intervals[i][0]){
                count++;
            }
            else {
                // updation of previnterval
                previnterval[0] = intervals[i][0];
                previnterval[1] = intervals[i][1];
            }
        }

        return count;
    }
}