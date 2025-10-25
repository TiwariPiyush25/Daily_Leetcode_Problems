class Solution {
    public static int lcs(int i,int j,String a,String b,int[][] dp){
        if (i<0 || j<0) return 0;

        if (dp[i][j]!=-1) return dp[i][j];
        if (a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + lcs(i-1,j-1,a,b,dp);
        else {
            return dp[i][j] = Math.max(lcs(i,j-1,a,b,dp),lcs(i-1,j,a,b,dp));
        }
    }
    public  int longestCommonSubsequence(String a,String b){ 
        int m = a.length() , n = b.length();
        int[][] dp=new int[m][n];
        for (int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);

        return lcs(m-1,n-1,a,b,dp);
    }
    public int longestPalindromeSubseq(String s) {
        String rev="";
        for (int i=0;i<s.length();i++){
            rev=s.charAt(i) + rev;
        }

        return longestCommonSubsequence(s,rev);
    }
    public int minInsertions(String s) {
        int lps = longestPalindromeSubseq(s);

        return s.length() - lps;
    }
}