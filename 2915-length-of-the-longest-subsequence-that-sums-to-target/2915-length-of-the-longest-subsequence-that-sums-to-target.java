class Solution {
    public int helper(int i,int sum,List<Integer> arr,int t,int[][] dp){
        if(i == arr.size() || sum > t){
            if(sum == t) return 0;
            return Integer.MIN_VALUE;
        }
        
        if(dp[i][sum] != -1) return dp[i][sum];
        int take = 1 + helper(i+1,sum + arr.get(i),arr,t,dp);
        int skip = helper(i+1,sum,arr,t,dp);
        return dp[i][sum] = Math.max(take,skip);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int[] d : dp) Arrays.fill(d,-1);

        int len = helper(0,0,nums,target,dp);
        return (len < 0) ? -1 : len;
    }
}