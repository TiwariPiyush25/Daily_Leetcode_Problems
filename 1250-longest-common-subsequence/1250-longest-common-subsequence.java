class Solution {
    public int[][] dp;
    public int lcs(int i,int j,String a,String b){
        if (i<0 || j<0) return 0;

        if (dp[i][j]!=-1) return dp[i][j];
        if (a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + lcs(i-1,j-1,a,b);
        else {
            return dp[i][j] = Math.max(lcs(i,j-1,a,b),lcs(i-1,j,a,b));
        }
    }
    public int longestCommonSubsequence(String a,String b){
        int m = a.length() , n = b.length();
        dp=new int[m][n];
        for (int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);

        return lcs(m-1,n-1,a,b);
    }
}