class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for(int i = 1;i < points.length;i++){
            int x = points[i][0] - points[i-1][0];
            int y = points[i][1] - points[i-1][1];
            x = Math.abs(x); y = Math.abs(y);

            time += Math.max(x,y);
        }

        return time;
    }
}