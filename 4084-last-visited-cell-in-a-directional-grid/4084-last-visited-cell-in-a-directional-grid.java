class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length , n = grid[0].length;
        
        int r = 0, c = 0;
        boolean[][] vis = new boolean[m][n];
        while(r < m && c < n){
            char ch = grid[r][c];

            if(ch == 'R'){
                if(c + 1 >= n || vis[r][c + 1]) return new int[]{r,c};
                vis[r][c] = true;
                c++;
            }
            else if(ch == 'L') {
                if(c - 1 < 0 || vis[r][c - 1]) return new int[]{r,c};
                vis[r][c] = true;
                c--;
            }
            else if(ch == 'U') {
                if(r - 1 < 0 || vis[r - 1][c]) return new int[]{r,c};
                vis[r][c] = true;
                r--;
            }
            else {
                if(r + 1 >= m || vis[r + 1][c]) return new int[]{r,c};
                vis[r][c] = true;
                r++;
            }
        }
        return new int[0];
    }
}