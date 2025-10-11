class Solution {
    public boolean SubsetExists(int[] arr,int target,int idx,int[][] dp){
        if (idx==arr.length) return target==0;

        if (dp[idx][target]!=-1) return (dp[idx][target]==1);

        boolean ans=false;
        boolean skip = SubsetExists(arr,target,idx+1,dp);
        if (target-arr[idx]<0) return ans = skip; // only valid for +ve Numbers
        else {
            boolean pick = SubsetExists(arr,target-arr[idx],idx+1,dp);
            ans = pick || skip;
        }

        if (ans) dp[idx][target] = 1;
        else dp[idx][target] = 0;
        return ans;
    }
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }

        if(sum%2!=0) return false;
        int target=sum/2;

        int n=arr.length;
        // i = 0 to n-1 | target = target to 0
        int[][] dp=new int[n][target+1];
        for (int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return SubsetExists(arr,target,0,dp);
    }
}