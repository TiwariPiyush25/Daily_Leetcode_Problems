class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];

        for(int i = 0;i < queries.length;i++){
            int cnt = 0;
            for(int[] point : points){
                int x = point[0] - queries[i][0];
                int y = point[1] - queries[i][1];
                double dist = Math.sqrt((x*x) + (y*y));

                if(dist <= (double) queries[i][2]) cnt++;
            }

            ans[i] = cnt;
        }

        return ans;
    }
}