class Solution {
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int ele:arr) sum+=ele;
        if(sum%2!=0) return false;

        int target=sum/2;
        int n=arr.length;
        int[][] dp=new int[n][target+1];

        for (int i=0;i<n;i++){
            for (int j=0;j<dp[0].length;j++){
                boolean ans = false;
                boolean skip = (i>0) ? (dp[i-1][j]==1) : (j==0);
                if ( j -arr[i]<0) ans = skip;
                else {
                    boolean pick = (i>0) ? (dp[i-1][j-arr[i]]==1) : j==0;
                    ans = pick || skip;
                }
                dp[i][j] = ans ? 1 : 0;
            }
        }

        return dp[n-1][target] == 1;
    }
}