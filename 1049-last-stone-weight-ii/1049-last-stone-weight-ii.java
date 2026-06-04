class Solution {
    public int helper(int i,int sum,int target,int[] arr,int[][] dp){
        if(i == arr.length){
            return 0;
        }

        if(dp[i][sum] != -1) return dp[i][sum];
        
        int take = 0;
        if (sum + arr[i] <= target) take = arr[i] + helper(i+1,sum + arr[i],target,arr,dp);
        int skip = helper(i+1,sum,target,arr,dp);

        return dp[i][sum] = Math.max(take , skip);
    }
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int ele : stones){
            sum += ele;
        }
        int[][] dp = new int[stones.length][(sum/2)+1];
        for(int[] d : dp) Arrays.fill(d,-1);
        int s = helper(0,0,sum/2,stones,dp); // maximum sum of a subset <= total sum of array / 2
        return sum - 2*s;
    }
}