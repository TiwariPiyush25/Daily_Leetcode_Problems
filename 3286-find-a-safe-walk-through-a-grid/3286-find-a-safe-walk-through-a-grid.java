class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size(), n = grid.get(0).size();

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { 0, 0, health - grid.get(0).get(0) });

        int[][] directions = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
        int[][] CurrHealth = new int[m][n];

        while (!q.isEmpty()) {
            int[] top = q.remove();
            int r = top[0], c = top[1], h = top[2];

            if (r == m - 1 && c == n - 1 && h >= 1)
                return true;

            for (int[] d : directions) {
                int newrow = r + d[0], newcol = c + d[1];

                if (newrow >= 0 && newrow < m && newcol >= 0 && newcol < n) {
                    int remhealth = h - grid.get(newrow).get(newcol);

                    if (remhealth > 0 && remhealth > CurrHealth[newrow][newcol]) {
                        q.add(new int[] { newrow, newcol, remhealth });
                        CurrHealth[newrow][newcol] = remhealth;
                    }
                }
            }
        }

        return false;
    }
}