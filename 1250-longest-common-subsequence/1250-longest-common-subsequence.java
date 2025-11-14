class Solution {
    public int helper(String a,String b,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j] =  1 + helper(a,b,i-1,j-1,dp);
        }
        else{
            int f = helper(a,b,i-1,j,dp);
            int s = helper(a,b,i,j-1,dp);

           return dp[i][j] = Math.max(f,s);
        }

        // return dp[dp.length-1][dp[0].length-1];
    }
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp=new int[m][n];
        for(int[] arr:dp) Arrays.fill(arr,-1);

        return helper(a,b,m-1,n-1,dp);
    }
}