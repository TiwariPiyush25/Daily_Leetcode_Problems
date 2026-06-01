class Solution {
    public int helper(int i,int prevChar,String s,String ans,int k,int[][] dp){
        if(i == s.length()) return 0;

        if(dp[i][prevChar] != -1) return dp[i][prevChar];

        int skip = helper(i+1,prevChar,s,ans,k,dp);
        int take = 0;
        int curr = s.charAt(i) - 'a';

        if(prevChar == 26 ||  Math.abs(curr - prevChar) <= k){
            take = 1 + helper(i+1,curr,s,ans+s.charAt(i),k,dp);
        } 
        int res = Math.max(skip,take);
        dp[i][prevChar] = res;
        return res;
    }
    public int longestIdealString(String s, int k) {
        int[][] dp = new int[s.length()][27];
        for(int[] d:dp) Arrays.fill(d,-1);

        int maxlen = helper(0,26,s,"",k,dp);
        return maxlen;
    }
}