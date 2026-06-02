class Solution {
    public int solve(int egg,int floor,int[][] dp){
        if(egg == 1 || floor <= 1) return floor;

        if(dp[egg][floor] != -1) return dp[egg][floor];

        int minAttempts = Integer.MAX_VALUE;

        int st = 1, end = floor;
        while(st <= end){
            int k = (st + end) / 2;

            int Eggbreaks = 0; int EggNotbreaks = 0;
            // egg Breaks from kth floor
            if(dp[egg-1][k-1] != -1) Eggbreaks = dp[egg-1][k-1];
            else {
                Eggbreaks = solve(egg - 1 , k - 1 , dp);
                dp[egg-1][k-1] = Eggbreaks;
            }

            // egg Not Breaks from kth floor
            if(dp[egg][floor-k] != -1) EggNotbreaks = dp[egg][floor-k];
            else {
                EggNotbreaks = solve(egg , floor - k , dp);
                dp[egg][floor-k] = EggNotbreaks;
            }

            minAttempts = Math.min(minAttempts , 1 + Math.max(Eggbreaks , EggNotbreaks));

            if(Eggbreaks < EggNotbreaks){
                st = k + 1;
            }
            else {
                end = k - 1;
            }
        }

        return dp[egg][floor] = minAttempts;
    }
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k+1][n+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return solve(k , n,dp);
    }
}