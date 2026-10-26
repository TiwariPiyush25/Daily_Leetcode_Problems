class Solution {
    public int countIslands(int[][] grid, int k) {
        Queue<int[]> q = new LinkedList<>();

        int m = grid.length, n = grid[0].length;
        int counter = 0;
        boolean[][] vis = new boolean[m][n];
        int[][] dir = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && !vis[i][j]) {
                    vis[i][j] = true;
                    q.add(new int[] {i, j});

                    long sum = (long) grid[i][j];
                    while (!q.isEmpty()) {
                        int[] top = q.remove();
                        int r = top[0], c = top[1];

                        for (int l = 0; l < 4; l++) {
                            int nr = r + dir[l][0], nc = c + dir[l][1];

                            if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] != 0 && !vis[nr][nc]) {
                                sum += grid[nr][nc];
                                q.add(new int[] {nr, nc});
                                vis[nr][nc] = true;
                            }
                        }
                    }
                    if (sum % k == 0) counter++;
                }
            }
        }

        return counter;
    }
}