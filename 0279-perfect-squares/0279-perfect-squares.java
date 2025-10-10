class Solution {
    public boolean isPerfect(int n){
        int Sqrt=(int)(Math.sqrt(n));

        return Sqrt*Sqrt==n;
    }
    public int minSquares(int n,int[] dp){
        if (isPerfect(n)) return 1;

        if (dp[n]!=-1) return dp[n];
        int min=Integer.MAX_VALUE;
        for (int i=1;i*i<n;i++){
            int count = minSquares(i*i,dp) + minSquares(n-i*i,dp);
            min=Math.min(count,min);
        }

        return dp[n] = min;
    }
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return minSquares(n,dp);
    }
}