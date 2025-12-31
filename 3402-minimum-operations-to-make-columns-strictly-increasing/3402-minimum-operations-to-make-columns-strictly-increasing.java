class Solution {
    public int minimumOperations(int[][] grid) {
        int total = 0;
        for(int j = 0;j<grid[0].length;j++){
            for(int i = 1;i<grid.length;i++){
                if(grid[i][j] <= grid[i-1][j]){
                    int prevval = grid[i][j];
                    int newval = grid[i-1][j] + 1;

                    total += newval - prevval;
                    grid[i][j] = newval;
                }
            }
        }

        return total;
    }
}