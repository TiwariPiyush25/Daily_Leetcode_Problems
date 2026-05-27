class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a , b) -> (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0]);

        int j = 0;
        int cnt = 0;
        for(int i = 1;i < intervals.length ; i++){
            int c = intervals[i][0] , d = intervals[i][1];
            int a = intervals[j][0], b = intervals[j][1];

            if(a <= c && d <= b){
                cnt++;
            }
            else {
                j = i;
            }
        }   

        return intervals.length - cnt;
    }
}