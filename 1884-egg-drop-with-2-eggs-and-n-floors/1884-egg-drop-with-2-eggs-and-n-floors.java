class Solution {
    public int solve(int egg,int floor,int[][] dp){
        if(egg == 1 || floor <= 1) return floor;

        if(dp[egg][floor] != -1) return dp[egg][floor];

        int minAttempts = Integer.MAX_VALUE;
        for(int k = 1;k <= floor;k++){
            int Eggbreaks = solve(egg - 1 , k - 1 , dp);
            int EggNotbreaks = solve(egg , floor - k , dp);

            minAttempts = Math.min(minAttempts , 1 + Math.max(Eggbreaks , EggNotbreaks));
        }

        return dp[egg][floor] = minAttempts;
    }
    public int twoEggDrop(int n) {
        int[][] dp = new int[3][n+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return solve( 2, n, dp);
    }
}