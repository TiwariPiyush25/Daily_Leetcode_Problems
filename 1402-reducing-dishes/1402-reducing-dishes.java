class Solution {
    public int helper(int i,int time,int[] arr,int[][] dp){
        if(i == arr.length) return 0;

        if(dp[i][time] != -1) return dp[i][time];

        int take = (time * arr[i]) + helper(i + 1,time + 1,arr,dp);
        int skip = helper(i + 1,time,arr,dp);

        return dp[i][time] = Math.max(take , skip);
    }
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        int[][] dp = new int[n][n+1];
        for(int[] d : dp) Arrays.fill(d , -1);

        Arrays.sort(satisfaction);

        return helper(0 , 1, satisfaction,dp);
    }
}