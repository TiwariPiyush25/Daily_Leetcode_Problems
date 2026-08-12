class Solution {
    public int findChampion(int[][] grid) {
        for(int i = 0;i < grid.length;i++){
            int cnt = 0;
            for(int j = 0;j < grid[0].length;j++){
                if(i != j && grid[i][j] == 1) cnt++;
            }

            if(cnt == grid[0].length - 1) return i;
        }

        return -1;
    }
}