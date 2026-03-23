class Solution {
    public int helper(int i,int zero,int one,int[][] arr,int m,int n,int[][][] dp){
        if(i==arr.length || zero > m || one > n){
            if(zero <= m && one <= n){
                return 0;
            }
            return Integer.MIN_VALUE;
        }

        if(dp[i][zero][one] != -1) return dp[i][zero][one];
        int take = 1 + helper(i+1,zero + arr[i][0],one + arr[i][1],arr,m,n,dp);
        int skip = helper(i+1,zero,one,arr,m,n,dp);

        return dp[i][zero][one] = Math.max(take,skip);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length][m+1][n+1];
        for(int[][] a:dp){
            for(int[] b:a){
                Arrays.fill(b,-1);
            }
        }

        int[][] arr = new int[strs.length][2];
        int k = 0;
        for(String s:strs){
            int one = 0, zero = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '0') zero++;
                else one++;
            }
            arr[k][0] = zero;
            arr[k][1] = one;
            k++;
        }

        int len = helper(0,0,0,arr,m,n,dp);
        return len < 0 ? 0 : len;
    }
}