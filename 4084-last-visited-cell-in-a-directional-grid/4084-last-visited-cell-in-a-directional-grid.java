class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length , n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        boolean[][] vis = new boolean[m][n];
        while(!q.isEmpty()){
            int[] top = q.remove();
            int r = top[0], c = top[1];

            char ch = grid[r][c];

            if(ch == 'R'){
                if(c + 1 >= n || vis[r][c + 1]) return new int[]{r,c};
                vis[r][c] = true;
                q.add(new int[]{r,c + 1});
            }
            else if(ch == 'L') {
                if(c - 1 < 0 || vis[r][c - 1]) return new int[]{r,c};
                vis[r][c] = true;
                q.add(new int[]{r,c - 1});
            }
            else if(ch == 'U') {
                if(r - 1 < 0 || vis[r - 1][c]) return new int[]{r,c};
                vis[r][c] = true;
                q.add(new int[]{r - 1,c});
            }
            else {
                if(r + 1 >= m || vis[r + 1][c]) return new int[]{r,c};
                vis[r][c] = true;
                q.add(new int[]{r + 1,c});
            }
        }
        return new int[0];
    }
}