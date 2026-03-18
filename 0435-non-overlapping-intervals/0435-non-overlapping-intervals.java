class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt = 0;

        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);

        int f = intervals[0][0] , l = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < l){
                cnt++;
            }
            else {
                f = intervals[i][0];
                l = intervals[i][1];
            }
        }

        return cnt;
    }
}