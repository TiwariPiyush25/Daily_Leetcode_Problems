class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);

        int[][] dp = new int[n + 1][n + 2];

        for(int i = n - 1;i >= 0 ;i--){
            for(int time = n;time >= 1;time--){
                int take = (time * satisfaction[i]) + dp[i + 1][time + 1];
                int skip = dp[i + 1][time];

                dp[i][time] = Math.max(take , skip);
            }
        }
        return dp[0][1];
    }
}