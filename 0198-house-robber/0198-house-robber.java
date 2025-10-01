class Solution {
    public int amount(int[] arr,int i,int[] dp){
        if(i>=arr.length) return 0;
        if (dp[i]!=-1) return dp[i];
        int take = arr[i] + amount(arr,i+2,dp);
        int skip = amount(arr,i+1,dp);

        dp[i]=Math.max(take,skip);
        
        return dp[i];
    }
    public int rob(int[] arr) {
        int n=arr.length;

        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return amount(arr,0,dp);
    }
}