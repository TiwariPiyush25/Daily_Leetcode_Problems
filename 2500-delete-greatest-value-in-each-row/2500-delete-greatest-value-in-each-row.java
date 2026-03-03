class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] arr:grid) Arrays.sort(arr);

        int score = 0;
        for(int j = grid[0].length-1;j>=0;j--){
            int max = 0;
            for(int i=0;i<grid.length;i++){
                max = Math.max(grid[i][j],max);
            }

            score += max;
        }
        return score;
    }
}