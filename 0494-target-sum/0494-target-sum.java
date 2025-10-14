class Solution {
    static int sum=0;
    private int ways(int i, int[] arr,int res , int t,int[][] dp) {
        if (i==arr.length){
            if (t==res) return 1; // 1 valid way
            else return 0; // Not a valid way
        }
        if (dp[i][res+sum]!=-1) return dp[i][res+sum];
        int addways = ways(i+1,arr,res+arr[i],t,dp);
        int subways = ways(i+1,arr,res-arr[i],t,dp);

        return dp[i][res+sum] = addways + subways;
    }
    public int findTargetSumWays(int[] nums, int target) {
        // i = 0 to n-1 | target = -sum to sum
        // dp[i][t+sum] = ways(i,target)
        int n=nums.length;
        sum=0;
        for (int ele:nums) sum+=ele;
        int[][] dp=new int[n][sum*2+1];
        for (int[] a:dp) Arrays.fill(a,-1);

        return ways(0,nums,0,target,dp);
    }
}