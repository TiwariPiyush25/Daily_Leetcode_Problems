class Solution {
    public static int[] dp;
    public static int fibdp(int n){ // using recursion + Memoization
        if (n<=1) return n;

        if (dp[n]!=0) return dp[n];
        int ans=fibdp(n-1) + fibdp(n-2);
        dp[n]=ans;

        return ans;
    }
    public int fib(int n) {
        dp=new int[n+1];
        return fibdp(n);
    }
}