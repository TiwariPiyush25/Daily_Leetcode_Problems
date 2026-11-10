class Solution {
    public int isit(int i,int k,int[] arr){
        int st = i + 1 , end = arr.length - 1;

        while(st <= end) {
            int mid = (st + end) / 2;

            if(arr[mid] == arr[i] + k) return mid;
            if(arr[mid] > arr[i] + k) end = mid - 1;
            else st = mid + 1;
        }

        return -1;
    }
    public boolean helper(int i,int lastJump,int[] stones,Boolean[][] dp) {
        if(i == stones.length - 1) return true;

        if(dp[i][lastJump] != null) return dp[i][lastJump];

        boolean jump1 = false,jump2 = false,jump3 = false;
        int f1 = isit(i,lastJump - 1,stones);
        int f2 = isit(i,lastJump,stones);
        int f3 = isit(i,lastJump + 1,stones);
        if(f1 != -1) jump1 = helper(f1,lastJump - 1,stones,dp);
        if(f2 != -1) jump2 = helper(f2,lastJump,stones,dp);
        if(f3 != -1) jump3 = helper(f3,lastJump + 1,stones,dp);

        return dp[i][lastJump] = (jump1 || jump2 || jump3);
    }
    public boolean canCross(int[] stones) {
        Boolean[][] dp = new Boolean[stones.length][stones.length];
        
        return helper(0,0,stones,dp);
    }
}