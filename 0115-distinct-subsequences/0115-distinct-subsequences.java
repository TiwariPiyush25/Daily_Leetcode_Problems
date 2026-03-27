class Solution {
    public int helper(int i,String temp,String s,String t,int[][] dp){
        int len = temp.length();
        if(temp.equals(t)) return 1;
        if((len > 0 && temp.charAt(len-1) != t.charAt(len-1)) || i >= s.length() || temp.length() >= t.length()){
            return 0;
        }

        if(dp[i][temp.length()] != -1) return dp[i][temp.length()];

        int take = helper(i+1,temp+s.charAt(i),s,t,dp);
        int skip = helper(i+1,temp,s,t,dp);

        return dp[i][temp.length()] = skip + take;
    }
    public int numDistinct(String s, String t) {
        if(s.equals(t)) return 1;
        int[][] dp = new int[s.length()][t.length()];
        for(int[] d:dp) Arrays.fill(d,-1);
        return helper(0,"",s,t,dp);
    }
}