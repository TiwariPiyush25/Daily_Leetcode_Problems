class Solution {
    public int mod = 1000000007;
    public int Score(int i,int j,int[][] grid,int[][] dp){
        if(i == 0 && j == 0) return 0;
        if(i < 0 || j < 0 || grid[i][j] == -1) return Integer.MIN_VALUE; 

        if(dp[i][j] != -1) return dp[i][j];
        int up = Score(i - 1,j,grid,dp);
        int left = Score(i,j-1,grid,dp);
        int upleft = Score(i-1,j-1,grid,dp);

        int ans = Math.max(up,Math.max(left,upleft));
        if(ans == Integer.MIN_VALUE) return dp[i][j] = Integer.MIN_VALUE;

        return dp[i][j] = grid[i][j] + ans;
    }

    public int Paths(int i,int j,int[][] grid,int[][][] dp,int sum,int target){
        if(i == 0 && j == 0){
            if(sum == target) return 1;
            return 0;
        }
        if(i < 0 || j < 0 || grid[i][j] == -1) return 0; 

        
        if(dp[i][j][sum] != -1) return dp[i][j][sum];

        int newSum = (sum + grid[i][j]) % mod;
        int up = Paths(i - 1,j,grid,dp,newSum,target) % mod;
        int left = Paths(i,j-1,grid,dp,newSum,target) % mod;
        int upleft = Paths(i-1,j-1,grid,dp,newSum,target) % mod;

        int ans = (up + left + upleft) % mod;
        return dp[i][j][sum] = ans;
    }
    public int[] pathsWithMaxScore(List<String> board) {
        int m = board.size(), n = board.get(0).length();
        int[][] grid = new int[m][n];

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                char ch = board.get(i).charAt(j);
                if(ch == 'E' || ch == 'S') grid[i][j] = 0;
                else if(ch >= '1' && ch <= '9') grid[i][j] = (int) ch - '0';
                else grid[i][j] = -1;
            }
        }

        int[][] dp1 = new int[m][n];
        for(int[] d: dp1) Arrays.fill(d,-1);

        int maxScore = Score(m-1,n-1,grid,dp1);
        if(maxScore < 0) return new int[]{0,0};

        
        int[][][] dp2 = new int[m][n][maxScore+1];
        for(int[][] arr : dp2){
            for(int[] a:arr) Arrays.fill(a,-1);
        }

        int noOfPaths = Paths(m-1,n-1,grid,dp2,0,maxScore);
        return new int[]{maxScore,noOfPaths};
    }
}