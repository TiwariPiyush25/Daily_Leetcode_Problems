class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for(int[] ind : indices){
            int r = ind[0], c = ind[1];
            for(int j = 0;j < n;j++){
                matrix[r][j]++;
            }

            for(int i = 0;i < m;i++){
                matrix[i][c]++;
            }
        }
        int cnt = 0;
        for(int[] x : matrix){
            for(int ele : x){
                if(ele % 2 != 0) cnt++;
            }
        }

        return cnt;
    }
}