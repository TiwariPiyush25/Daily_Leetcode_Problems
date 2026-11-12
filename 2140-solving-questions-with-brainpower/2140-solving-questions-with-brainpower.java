class Solution {
    public long helper(int i,int[][] arr,long[] dp) {
        if(i >= arr.length) return 0;

        if(dp[i] != -1) return dp[i];
        long take = arr[i][0] + helper(i + arr[i][1] + 1,arr , dp);
        long skip = helper(i + 1,arr ,dp);

        return dp[i] = Math.max(take , skip);
    }
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        Arrays.fill(dp , -1);

        return helper(0,questions,dp);
    }
}