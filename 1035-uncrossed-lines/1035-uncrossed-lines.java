class Solution {
    public int helper(int[] a,int[] b,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];

        if(a[i]==b[j]){
            return dp[i][j] =  1 + helper(a,b,i-1,j-1,dp);
        }
        else{
            int f = helper(a,b,i-1,j,dp);
            int s = helper(a,b,i,j-1,dp);

           return dp[i][j] = Math.max(f,s);
        }
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length;
        int[][] dp=new int[m][n];
        for(int[] arr:dp) Arrays.fill(arr,-1);

        return helper(nums1,nums2,m-1,n-1,dp);
    }
}