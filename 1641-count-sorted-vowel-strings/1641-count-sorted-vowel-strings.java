class Solution {
    public int helper(int i,int n,char[] vowel,StringBuilder s,int[][] dp){
        if(i>=vowel.length) return 0;
        if(n==0) return 1;
        
        if(dp[n][i]!=-1) return dp[n][i];
        int skip = 0 , take = 0;
        skip += helper(i+1,n,vowel,s,dp);
        take += helper(i,n-1,vowel,s.append(vowel[i]),dp);

        return dp[n][i] = skip + take;
    }
    public int countVowelStrings(int n) {
        int[][] dp = new int[n+1][5];
        for(int[] arr:dp) Arrays.fill(arr,-1);

        char[] vowel={'a','e','i','o','u'};
        return helper(0,n,vowel,new StringBuilder(),dp);
    }
}