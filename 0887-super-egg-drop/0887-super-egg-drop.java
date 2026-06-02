class Solution {
    public int solve(int egg,int floor,int[][] dp){
        if(egg == 1 || floor <= 1) return floor;

        if(dp[egg][floor] != -1) return dp[egg][floor];

        int minAttempts = Integer.MAX_VALUE;

        int st = 1, end = floor;
        while(st <= end){
            int k = (st + end) / 2; // mid floor

            int Eggbreaks  = solve(egg - 1 , k - 1 , dp); // egg Breaks from kth floor
            int EggNotbreaks = solve(egg , floor - k , dp); // egg Not Breaks from kth floor
            
            minAttempts = Math.min(minAttempts , 1 + Math.max(Eggbreaks , EggNotbreaks));

            if(Eggbreaks < EggNotbreaks){ // attemps in EggBreak is less than EggNotbreaks
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