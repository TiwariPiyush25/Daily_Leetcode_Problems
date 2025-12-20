class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 0;
        int n = s.length();
        int st = -1, end = -1;
        int[][] dp = new int[n][n];

        for (int k = 0; k < n; k++){
            int i = 0 , j = k;
            while(j<n){
                if (i==j) dp[i][j] = 1;  // 1 length string
                else if(i == j-1 && s.charAt(i) == s.charAt(j)){ // 2 length string
                    dp[i][j] = 1;
                }
                else {
                    if (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1) dp[i][j] = 1;
                }

                if(dp[i][j]==1 && j-i+1 > maxlen){
                    maxlen = j-i+1;
                    st = i;
                    end = j;
                }
                i++; j++;
            }
        }

        StringBuilder ans = new StringBuilder();
        while(st!=end+1){
            ans.append(s.charAt(st));
            st++;
        }
        return ans.toString();
    }
}